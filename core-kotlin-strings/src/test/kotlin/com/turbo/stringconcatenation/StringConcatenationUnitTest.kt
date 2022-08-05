package com.turbo.stringconcatenation

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringConcatenationUnitTest {

    @Test
    fun givenTwoStrings_concatenateWithTemplates_thenEquals() {
        val a = "Hello"
        val b = "turbo"
        val c = "$a $b"

        assertEquals("Hello turbo", c)
    }

    @Test
    fun givenTwoStrings_concatenateWithPlusOperator_thenEquals() {
        val a = "Hello"
        val b = "turbo"
        val c = a + " " + b

        assertEquals("Hello turbo", c)
    }

    @Test
    fun givenTwoStrings_concatenateWithStringBuilder_thenEquals() {
        val a = "Hello"
        val b = "turbo"

        val builder = StringBuilder()
        builder.append(a).append(" ").append(b)

        val c = builder.toString()

        assertEquals("Hello turbo", c)
    }

    @Test
    fun givenTwoStrings_concatenateWithPlusMethod_thenEquals() {
        val a = "Hello"
        val b = "turbo"
        val c = a.plus(" ").plus(b)

        assertEquals("Hello turbo", c)
    }

}
