import java.util.Arrays;

public class Challenge {
	private static String[] summarizeRanges(int[] arr) {
		// write your code here
		return null;
	}

	public static void main(String[] args) {
		int[][] inputs = {{1,2,3,4,5,8,9,10}, {4,5,6,7,10,11,12}, {1,3,5,6,7}};
		String[][] outputs = {{"1->5", "8->9", "10"}, {"4->7", "10->12"}, {"1", "3", "5->7"}};

		int[][] bonusInputs = {{10,1,8,2,2,3,9,4,8}, {7,6,6,4,8,6,7,5}};
		String[][] bonusOutputs = {{"1->4", "8->10"}, {"4->8"}};

		for (int i = 0; i < inputs.length; i++) {
			if (!Arrays.equals(summarizeRanges(inputs[i]), outputs[i])) {
				System.out.println("Test #" + i + " Failed\nInput: \"" + Arrays.toString(inputs[i]) + "\"\nExpected Output: " + Arrays.toString(outputs[i]));
				System.exit(1);
			}
		}

		System.out.println("All basic tests passed!");

		for (int i = 0; i < bonusInputs.length; i++) {
			if (!Arrays.equals(summarizeRanges(bonusInputs[i]), bonusOutputs[i])) {
				System.out.println("Bonus Test #" + i + " Failed\nInput: \"" + Arrays.toString(bonusInputs[i]) + "\"\nExpected Output: " + Arrays.toString(bonusOutputs[i]));
				System.exit(1);
			}
		}

		System.out.println("All tests passed!");
	}
}
