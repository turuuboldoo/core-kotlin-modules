package com.turbo.staticinit

class Static {

    companion object {
        lateinit var answer: String

        init {
            answer = "42"
            println("Initialized")
        }
    }
}