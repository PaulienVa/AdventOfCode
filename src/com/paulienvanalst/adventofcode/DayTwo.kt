package com.paulienvanalst.adventofcode

object MaxMinCheckSum {
    fun calculate(linesTable: List<String>): Int = linesTable
        .map {
            val numbers = it.mapToIntList()
            numbers.max()!! - numbers.min()!!
        }
        .sum()
}

object EvenlyDividableChecksum {
    fun calculate(linesTable: List<String>) : Int = linesTable
        .map {
            quotientOfEvenlyDividable(it.mapToIntList().sortedDescending())
        }.sum()

    private fun quotientOfEvenlyDividable(line: List<Int>): Int {
        val evenDivision = line.flatMap {
            (line - it).filter { rest -> it % rest == 0  || rest % it == 0}
        }
        return evenDivision.max()!! / evenDivision.min()!!
    }
}

fun String.mapToIntList() : List<Int> = this.split(" ").map { Integer.valueOf(it) }
