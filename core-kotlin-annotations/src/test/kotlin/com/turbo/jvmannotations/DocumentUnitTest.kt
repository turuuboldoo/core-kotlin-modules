package com.turbo.range

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

import com.turbo.jvmannotations.*;

class DocumentUnitTest {

    @Test
    fun testDefaultMethod() {

        val myDocument = TextDocument()
        val myTextDocument = XmlDocument(myDocument)

        assertEquals("text", myDocument.getType())
        assertEquals("text", myTextDocument.getType())
        assertEquals("document", myTextDocument.getTypeDefault())
    }
}