import sys


def isBalanced(string: str) -> bool:
    # Your code goes here
    pass


inputs = ["[]", "[{}]", "[{]}", "[[", "]]", "}{", "[{()}]"]
outputs = [True, True, False, False, False, False, True]

for inp, otpt in zip(inputs, outputs):
    if isBalanced(inp) != otpt:
        print("Wrong output on test #{}".format(1+inputs.index(inp)))
        print("Input: {}".format(inp))
        print("Expected output: {}".format(otpt))
        sys.exit(0)

print("You've passed all test cases")
