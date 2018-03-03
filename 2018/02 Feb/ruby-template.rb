def isBalanced(string)
    # your code here
end

inputs = ["[]", "[{}]", "[{]}", "[[", "]]", "}{", "[{()}]"]
outputs = [true, true, false, false, false, false, true]

cases = inputs.length

for i in (0...cases)
    inp = inputs[i]
    otpt = outputs[i]
    if otpt != isBalanced(inp)
        puts "Wrong output on test ##{i+1}"
        puts "Input: #{inp}"
        puts "Expected output: #{otpt}"
        exit!
    end
end

puts "You've passed all test cases!"
