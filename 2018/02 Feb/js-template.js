function isBalanced(string) {
  // your code goes here
}

function main() {
  var inputs = ["[]", "[{}]", "[{]}", "[[", "]]", "}{", "[{()}]"]
  var outputs = [true, true, false, false, false, false, true]
  
  for (var i = 0; i < inputs.length; i++) {
    if (isBalanced(inputs[i]) != outputs[i]) {
      console.log("Wrong output on test #" + (i+1));
      console.log("Input: " + inputs[i]);
      console.log("Expected output: " + outputs[i]);
      return;
    }
  }
  
  console.log("You've passed all test cases");
}

main();
