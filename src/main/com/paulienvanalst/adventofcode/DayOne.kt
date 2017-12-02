package com.paulienvanalst.adventofcode


object Captcha {

    fun calculateInverse(input: String): Int {
        val values = input.toCharArray().map { Integer.valueOf(it.toString()) }
        return captcha(values, 1)

    }

    fun calculateCircular(input: String): Int {
        val values = input.toCharArray().map { Integer.valueOf(it.toString()) }
        return captcha(values, input.length / 2)
    }


    private fun captcha(values: List<Int>, stepSize: Int): Int {
        return values.mapIndexed { index, number ->
            if (values[(index + stepSize) % values.size] == number) number else 0
        }.sum()
    }
}


