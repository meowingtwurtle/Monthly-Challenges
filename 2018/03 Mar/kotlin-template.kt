import java.util.*

private fun summariseRanges(ints: IntArray): Array<String> {
    return arrayOf() // Empty Array; Replace with your solution!
}

fun main(args: Array<String>) {
    val inputs = arrayOf(
            intArrayOf(1, 2, 3, 4, 5, 8, 9, 11),
            intArrayOf(4, 5, 6, 7, 10, 11, 12),
            intArrayOf(1, 3, 5, 6, 7)
    )
    val outputs = arrayOf(
            arrayOf("1->5", "8->9", "11"),
            arrayOf("4->7", "10->12"),
            arrayOf("1", "3", "5->7")
    )

    val bonusInputs = arrayOf(
            intArrayOf(1, 2, 3, 4, 5, 8, 9, 11),
            intArrayOf(4, 5, 6, 7, 10, 11, 12),
            intArrayOf(1, 3, 5, 6, 7)
    )
    val bonusOutputs = arrayOf(
            arrayOf("1->5", "8->9", "11"),
            arrayOf("4->7", "10->12"),
            arrayOf("1", "3", "5->7")
    )

    for (i in 0 until inputs.size) {
        if (!Arrays.equals(summariseRanges(inputs[i]), outputs[i])) {
            println("Test #" + i + " Failed\n" +
                    "Input: ${Arrays.toString(inputs[i])}\n" +
                    "Expected Output: ${Arrays.toString(outputs[i])}\n" +
                    "Actual Output: ${Arrays.toString(summariseRanges(inputs[i]))}")
            System.exit(1);
        }
    }

    println("All basic tests passed!")

    for (i in 0 until bonusInputs.size) {
        if (!Arrays.equals(summariseRanges(bonusInputs[i]), bonusOutputs[i])) {
            println("Bonus Test #" + i + " Failed\n" +
                    "Input: ${Arrays.toString(bonusInputs[i])}\n" +
                    "Expected Output: ${Arrays.toString(bonusOutputs[i])}\n" +
                    "Actual Output: ${Arrays.toString(summariseRanges(bonusInputs[i]))}")
            System.exit(1);
        }
    }

    println("All tests passed!");

}
