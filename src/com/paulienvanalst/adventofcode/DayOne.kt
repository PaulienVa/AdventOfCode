package com.paulienvanalst.adventofcode


object InverseCaptcha {

    fun calculate(input: String): Int {
        return sumTheNeighbours(input.iterator(), determineStartSum(input), "")
    }

    private fun sumTheNeighbours(input: CharIterator, sum: Int, previousChar: String): Int {
        if (input.hasNext()){
            val nextChar = input.nextChar().toString()
            compareTwoCharAndDetermineSum(previousChar, nextChar, sum)
            return sumTheNeighbours(input, sum, nextChar)
        }
        return sum
    }

    private fun compareTwoCharAndDetermineSum(previousChar: String, nextChar: String, sum: Int): Integer {
        if (previousChar == nextChar) {
            return Integer.valueOf(previousChar) + Integer.valueOf(nextChar)
        }
    }
}