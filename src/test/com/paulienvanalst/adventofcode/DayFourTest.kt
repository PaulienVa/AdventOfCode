package com.paulienvanalst.adventofcode

import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DayFourTest {

    @Test
    fun `"aa bb cc dd ee"  is a valid paraphrase`() {
        assertTrue(PassPhrase.isValid("aa bb cc dd ee"))
    }

    @Test
    fun `"aa bb cc dd ee aaa"  is a valid paraphrase`() {
        assertTrue(PassPhrase.isValid("aa bb cc dd ee aaa"))
    }

    @Test
    fun `"aa bb cc dd ee aa"  is an invalid paraphrase`() {
        assertFalse(PassPhrase.isValid("aa bb cc dd ee aa"))
    }

    @Test
    fun `count that two out of three phrases are correct` () {
        assertEquals(2, PassPhrase.countValidLines(listOf("aa bb cc dd ee", "aa bb cc dd ee aaa", "aa bb cc dd ee aa")))
    }

    @Test
    fun `my input` () {
        val lines = File(ClassLoader.getSystemResource("input/DayFour_PartOne.txt").file).readLines()

        assertEquals(383, PassPhrase.countValidLines(lines))
    }

}