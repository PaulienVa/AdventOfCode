package com.paulienvanalst.adventofcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

class D2P1Test {
    @Test
    fun `table should result in checksum of 18` () {
        val linesTable = File(ClassLoader.getSystemResource("examples/DayTwo_PartOne.txt").file).readLines()
        assertEquals(18, MaxMinCheckSum.calculate(linesTable))
    }

    @Test
    fun `my own puzzle input`() {
        val linesTable = File(ClassLoader.getSystemResource("input/DayTwo_PartOne.txt").file).readLines()
        print( MaxMinCheckSum.calculate(linesTable) )
    }
}

class D2P2Test {
    @Test
    fun `table should rest in checksum of 9`() {
        val linesTable = File(ClassLoader.getSystemResource("examples/DayTwo_PartTwo.txt").file).readLines()
        assertEquals(9, EvenlyDividableChecksum.calculate(linesTable))
    }


    @Test
    fun `my own puzzle input`() {
        val linesTable = File(ClassLoader.getSystemResource("input/DayTwo_PartTwo.txt").file).readLines()
        print(EvenlyDividableChecksum.calculate(linesTable))
    }

}