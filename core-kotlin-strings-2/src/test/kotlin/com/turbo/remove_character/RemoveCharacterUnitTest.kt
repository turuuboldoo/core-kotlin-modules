package com.turbo.remove_character

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveCharacterUnitTest {

    @Test
    fun `should remove character from string using replace`() {
        val string = "tu.rbo"
        assertEquals("turbo", string.replace(".", ""))
    }

    @Test
    fun `should remove character from string using filter`() {
        val string = "tu.rbo"
        assertEquals("turbo", string.filterNot { it == '.' })
    }

    @Test
    fun `should remove character from string using deleteAt`() {
        val string = "tu.rbo"
        val stringBuilder = StringBuilder(string)
        assertEquals("turbo", stringBuilder.deleteAt(2).toString())
    }

    @Test
    fun `should remove character by using removeRange`() {
        val string = "tu.rbo"
        assertEquals("turbo", string.removeRange(2, 3))
    }

    @Test
    fun `should remove last character from string`() {
        val string = "turbo"
        assertEquals("turbo", string.removePrefix("Z"))
    }

    @Test
    fun `should remove first character from string`() {
        val string = "turbo"
        assertEquals("turbo", string.removePrefix("Z"))
    }
}
