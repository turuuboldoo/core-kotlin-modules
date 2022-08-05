package com.turbo.count_characters

import org.junit.jupiter.api.Test
import java.util.regex.Pattern
import kotlin.test.assertEquals

class CountCharactersUnitTest {

    @Test
    fun `should count characters using count`() {
        val string = "hello world, turbo"
        assertEquals(2, string.count { it == 'r' })
    }

    @Test
    fun `should count characters using length difference`() {
        val string = "hello world, turbo"
        val counter = string.length - string.replace("e", "").length
        assertEquals(1, counter)
    }

    @Test
    fun `should count characters using patterns`() {
        val string = "hello world, turbo"
        val matcher = Pattern.compile("o").matcher(string)
        var counter = 0
        while (matcher.find()) {
            counter++
        }
        assertEquals(3, counter)
    }

    @Test
    fun `should count characters using map`() {
        val string = "hello world, turbo"
        val occurrencesMap = mutableMapOf<Char, Int>()
        for (c in string) {
            occurrencesMap.putIfAbsent(c, 0)
            occurrencesMap[c] = occurrencesMap[c]!! + 1
        }
        assertEquals(1, occurrencesMap['e'])
    }

    @Test
    fun `should count characters using iteration`() {
        val string = "hello world, turbo"
        var counter = 0
        for (c in string) {
            if (c == 'o') {
                counter++
            }
        }
        assertEquals(3, counter)
    }
}