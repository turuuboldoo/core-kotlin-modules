package com.turbo.assertFailsWith

class AssertFailsWithFunction {
    fun assertFailsWithMessage(){
        val array = intArrayOf(1, 2, 3)
        array[5]
    }

    fun assertFailsWithExceptionClass(){
        val message = "Kotlin Tutorials in turbo".toInt()
    }

    fun assertFailsWithMessageAndExceptionClass(){
        val result = 50 * 12 / 0
    }
}