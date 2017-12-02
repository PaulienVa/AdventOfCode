package com.paulienvanalst.adventofcode


object InverseCaptcha {

    fun calculate(input: String): Int {
        val values = input.toCharArray().map { Integer.valueOf(it.toString()) }
        return determineSum(values.iterator(), IntermediateHash(0, initialAccumulator(values)))
    }

    private fun initialAccumulator(values: List<Int>): Int {
        if (values.first() == values.last()) {
            return values.first()
        }
        return 0
    }

    private fun determineSum(values: Iterator<Int>, previousHash: IntermediateHash): Int {
        if (values.hasNext()) {
            val nextValue = values.next()
            if (nextValue == previousHash.previousValue) {
                return determineSum(values, IntermediateHash(nextValue, previousHash.acc + nextValue))
            }
            return determineSum(values, IntermediateHash(nextValue, previousHash.acc))
        }
        return previousHash.acc

    }

    data class IntermediateHash(val previousValue: Int, val acc: Int)
}

object CircularInverseCaptcha {
    fun calculate(input: String): Int {
        val stepSize = input.length / 2
        val values = input.toCharArray().map { Integer.valueOf(it.toString()) }
        return determineSum(values, 0, stepSize)
    }

    private fun determineSum(values: List<Int>, sum: Int, stepSize: Int): Int {
        if (values.isEmpty() || values.size <= stepSize) {
            return sum
        }

        if (values.first() == values[stepSize]){
            return determineSum(values.tail(), sum + values.first() + values[stepSize], stepSize)
        }
        return determineSum(values.tail(), sum, stepSize)
    }

    private fun List<Int>.tail() = this.subList(1, this.size)

}