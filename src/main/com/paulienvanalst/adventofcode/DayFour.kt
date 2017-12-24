package com.paulienvanalst.adventofcode

private val SPACE = " "

object PassPhrase {
    fun isValid(phrase: String): Boolean {
        return phrase.split(SPACE) == phrase.split(SPACE).distinct()
    }

    fun countValidLines (lines : List<String>): Int {
        return lines.count { isValid(it) }
    }
}

object AnagramParaphrase {
    fun isValid(sentence: String): Boolean {
        val allWords = sentence.split(SPACE)
        val listOfLetters = allWords.map { it.toCharArray().toList().sorted() }
        return allWords.size == listOfLetters.distinct().size
    }

}