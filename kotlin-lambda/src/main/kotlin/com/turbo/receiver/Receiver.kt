package com.turbo.receiver

import java.util.*

fun main() {
    "Turbo".applyThenReturn { n -> println(n.uppercase(Locale.getDefault())) }
    "Turbo".apply { println(uppercase(Locale.getDefault())) }
}

fun <T> T.applyThenReturn(f: (T) -> Unit): T {
    f(this)
    return this
}

fun <T> T.apply(f: T.() -> Unit): T {
    f() // or this.f()
    return this
}
