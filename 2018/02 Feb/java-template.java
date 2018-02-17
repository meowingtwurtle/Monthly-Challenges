public class Challenge {
	private static boolean isBalanced(String str) {
		// write your code here
		return false;
	}

	public static void main(String[] args) {
		String[] inputs = {"[]", "[{}]", "[{]}", "[[", "]]", "}{", "[{()}]"};
		boolean[] outputs = {true, true, false, false, false, false, true};

		for (int i = 0; i < inputs.length; i++) {
			if (isBalanced(inputs[i]) != outputs[i]) {
				System.out.println("Test #" + i + " Failed\nInput: \"" + inputs[i] + "\"\nExpected Output: " + outputs[i]);
				System.exit(1);
			}
		}

		System.out.println("All tests passed!");
	}
}
