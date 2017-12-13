package com.paulienvanalst.adventofcode

object PassPhrase {
    private val SPACE = " "

    fun isValid(phrase: String): Boolean {
        return phrase.split(SPACE) == phrase.split(SPACE).distinct()
    }

    fun countValidLines (lines : List<String>): Int {
        return lines.count { isValid(it) }
    }
}