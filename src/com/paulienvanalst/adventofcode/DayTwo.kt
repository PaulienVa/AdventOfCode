package com.paulienvanalst.adventofcode

object CheckSum {
    fun calculate(linesTable: List<String>): Int {
        val differences = linesTable.map {
            val numbers = it.split(" ").map { Integer.valueOf(it) }
            numbers.max()!! - numbers.min()!!
        }
        return differences.sum()
    }

}