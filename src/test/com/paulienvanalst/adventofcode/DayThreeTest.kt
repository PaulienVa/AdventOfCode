package com.paulienvanalst.adventofcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DayThreeTest {

    @Test // angle 0
    fun extr() {
        ManhattanDistance.forPoint(9)
        ManhattanDistance.forPoint(25)
        ManhattanDistance.forPoint(49)
    }

    @Test // angle 2 4 6
    fun extr1() {
        ManhattanDistance.forPoint(3)
        ManhattanDistance.forPoint(13)
        ManhattanDistance.forPoint(31)
    }

    @Test // angle
    fun extr3() {
        ManhattanDistance.forPoint(7)
        ManhattanDistance.forPoint(21)
        ManhattanDistance.forPoint(43)
    }

    @Test // angle 2 4 6
    fun extr2() {
        ManhattanDistance.forPoint(5)
        ManhattanDistance.forPoint(16)
        ManhattanDistance.forPoint(37)
    }

    @Test // angle 2 4 6
    fun line() {
        ManhattanDistance.forPoint(8)
        ManhattanDistance.forPoint(23)
        ManhattanDistance.forPoint(34)
    }

    @Test
    fun `distance for 1 is 0` () {
        assertEquals(0, ManhattanDistance.forPoint(1))
    }

    @Test
    fun `distance for 12 is 3` () {
        assertEquals(3, ManhattanDistance.forPoint(12))
    }

    @Test
    fun `distance for 17 is 4` () {
        assertEquals(4, ManhattanDistance.forPoint(2))
    }

    @Test
    fun `distance for 20 is 3` () {
        assertEquals(3, ManhattanDistance.forPoint(20))
    }

    @Test
    fun `distance for 50 is 4` () {
        assertEquals(4, ManhattanDistance.forPoint(50))
    }

    @Test
    fun `distance for 23 is 2` () {
        assertEquals(2, ManhattanDistance.forPoint(23))
    }
}