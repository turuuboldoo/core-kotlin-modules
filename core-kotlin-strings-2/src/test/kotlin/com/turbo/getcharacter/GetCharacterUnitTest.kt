package com.turbo.getcharacter

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GetCharacterUnitTest {

    @Test
    fun `should get character from string using indexing`() {
        val string = "turbo"
        assertEquals('b', string[3])
    }

    @Test
    fun `should get character from string using get`() {
        val string = "turbo"
        assertEquals('b', string.get(3))
    }

    @Test
    fun `should get first character from string`() {
        val string = "turbo"
        assertEquals('t', string.first())
    }

    @Test
    fun `should get last character from string`() {
        val string = "turbo"
        assertEquals('o', string.last())
    }

    @Test
    fun `should get single character from string`() {
        val string = "A"
        assertEquals('A', string.single())
    }

    @Test
    fun `should get single character by converting to array`() {
        val string = "turbo"
        val toCharArray = string.toCharArray()
        assertEquals('b', toCharArray[3])
    }

    @Test
    fun `should get single character by subsequence`() {
        val string = "turbo"
        val substring = string.subSequence(3, 4).single()
        println(substring)
        assertEquals('b', substring)
    }
}
