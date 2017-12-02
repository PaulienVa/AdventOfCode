package com.paulienvanalst.adventofcode

object CheckSum {
    fun minMax (linesTable: List<String>): Int = linesTable.checksum(minMax)

    fun evenDividable (linesTable: List<String>) : Int = linesTable.checksum(quotient)

    private fun List<String>.checksum(calculationMethod: (String) -> Int): Int {
        return this.map {calculationMethod (it)}.sum()
    }

    private val minMax: (it: String) -> Int = {
        val numbers = it.mapToIntList()
        numbers.max()!! - numbers.min()!!
    }

    private val quotient: (it: String) -> Int = {
        val line = it.mapToIntList().sortedDescending()
        val evenDivision = line.flatMap {
            (line - it).filter { rest -> it % rest == 0  || rest % it == 0}
        }
        evenDivision.max()!! / evenDivision.min()!!
    }

    private fun String.mapToIntList() : List<Int> = this.split(" ").map { Integer.valueOf(it) }
}



