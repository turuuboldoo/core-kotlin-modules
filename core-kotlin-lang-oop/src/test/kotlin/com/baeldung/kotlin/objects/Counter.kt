package com.turbo.kotlin.objects

object Counter {
    private var count: Int = 0

    fun currentCount() = count

    fun increment() {
        ++count
    }

    fun decrement() {
        --count
    }
}
