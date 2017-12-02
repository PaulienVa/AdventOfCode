package com.paulienvanalst.adventofcode


object Captcha {

    fun calculateInverse(input: String): Int {
        return captcha(input.toIntegerList(), 1)
    }

    fun calculateCircular(input: String): Int {
        return captcha(input.toIntegerList(), input.length / 2)
    }

    private fun captcha(values: List<Int>, stepSize: Int): Int {
        return values.mapIndexed { index, number ->
            if (values[(index + stepSize) % values.size] == number) number else 0
        }.sum()
    }

    private fun String.toIntegerList() : List<Int> = this.toCharArray().map { Integer.valueOf(it.toString()) }
}


