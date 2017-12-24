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
    fun `my input part one` () {
        val lines = File(ClassLoader.getSystemResource("input/DayFour_PartOne.txt").file).readLines()
        assertEquals(383, PassPhrase.countValidLines(lines))
    }

    @Test
    fun `anagram does not show in sentence` () {
        assertTrue(AnagramParaphrase.isValid("abcde fghij"))
        assertTrue(AnagramParaphrase.isValid("a ab abc abd abf abj"))
        assertTrue(AnagramParaphrase.isValid("iiii oiii ooii oooi oooo"))
    }

    @Test
    fun `anagram shows in sentence and makes it invalid` () {
        assertFalse(AnagramParaphrase.isValid("abcde xyz ecdab"))
        assertFalse(AnagramParaphrase.isValid("oiii ioii iioi iiio"))
    }

    @Test
    fun `my input part two` () {
        val lines = File(ClassLoader.getSystemResource("input/DayFour_PartTwo.txt").file).readLines()
        assertEquals(265, lines.filter { AnagramParaphrase.isValid(it) }.count())
    }

}