package com.turbo.base64

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import java.util.Base64
import org.apache.commons.codec.binary.Base64 as ApacheBase64

class Base64UnitTest {
    @Test
    fun `check Base64 encoding of string using Base64 utility`() {
        val originalString = "turbo"
        val encodedString: String = Base64.getEncoder().encodeToString(originalString.toByteArray())
        println(encodedString)
        assertEquals("dHVyYm8=", encodedString)
    }

    @Test
    fun `check Base64 decoding of string using Base64 utility`() {
        val encodedString = "dHVyYm8="
        val decodedString: String = String(Base64.getDecoder().decode(encodedString))
        assertEquals("turbo", decodedString)
    }

    @Test
    fun `check Base64 encoding of string using ApacheBase64 utility`() {
        val originalString = "turbo"
        val base64: ApacheBase64 = ApacheBase64()
        val encodedStr = String(base64.encode(originalString.toByteArray()))
        assertEquals("dHVyYm8=", encodedStr)
    }

    @Test
    fun `check Base64 decoding of string using ApacheBase64 utility`() {
        val encodedString = "dHVyYm8="
        val base64: ApacheBase64 = ApacheBase64()
        val decodedString: String = String(base64.decode(encodedString))
        assertEquals("turbo", decodedString)
    }
}