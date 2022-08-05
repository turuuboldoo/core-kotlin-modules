package com.turbo.outside.protectedmodifier

import com.turbo.protectedmodifier.InternalClass
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

internal class AccessInternalClassTest {

    @Test
    fun whenCallInternalClass_thenItWorks(){
        val internalClass = InternalClass()
        assertThat(internalClass.helloFromInternalFunction()).isEqualTo("Hello")
    }
}