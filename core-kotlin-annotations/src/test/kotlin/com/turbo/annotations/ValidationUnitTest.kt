package com.turbo.annotations

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class ValidationUnitTest {

    @Test
    fun whenAmountIsOneAndNameIsAlice_thenTrue() {
        assertTrue(Validator().isValid(Item(1f, "Alice")))
    }

    @Test
    fun whenAmountIsOneAndNameIsBob_thenTrue() {
        assertTrue(Validator().isValid(Item(1f, "Bob")))
    }


    @Test
    fun whenAmountIsMinusOneAndNameIsAlice_thenFalse() {
        assertFalse(Validator().isValid(Item(-1f, "Alice")))
    }

    @Test
    fun whenAmountIsMinusOneAndNameIsBob_thenFalse() {
        assertFalse(Validator().isValid(Item(-1f, "Bob")))
    }

    @Test
    fun whenAmountIsOneAndNameIsTom_thenFalse() {
        assertFalse(Validator().isValid(Item(1f, "Tom")))
    }

    @Test
    fun whenAmountIsMinusOneAndNameIsTom_thenFalse() {
        assertFalse(Validator().isValid(Item(-1f, "Tom")))
    }


}