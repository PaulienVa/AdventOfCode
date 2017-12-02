package com.paulienvanalst.adventofcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

class DayTwoTest {
    @Test
    fun `table should result in checksum of 18` () {
        val linesTable = File(ClassLoader.getSystemResource("examples/DayTwo_PartOne.txt").file).readLines()
        assertEquals(18, CheckSum.calculate(linesTable))
    }

    @Test
    fun `my own puzzle input`() {
        val linesTable = File(ClassLoader.getSystemResource("input/DayTwo_PartOne.txt").file).readLines()
        print( CheckSum.calculate(linesTable) )
    }
}