package com.turbo.static

import org.junit.jupiter.api.Test

class LoggingUtilsUnitTest {
    @Test
    fun givenAPackageMethod_whenCalled_thenNoErrorIsThrown() {
        debug("test message")
    }
}