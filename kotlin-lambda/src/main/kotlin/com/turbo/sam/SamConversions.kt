package com.turbo.sam

import java.util.concurrent.Callable
import java.util.concurrent.Executors

@Suppress("ObjectLiteralToLambda", "MoveLambdaOutsideParentheses")
fun main() {
    Thread(object : Runnable {
        override fun run() {
            println("objectExpressionThread")
        }
    }).start()

    Thread({
        println("lambdaThread")
    }).start()

    Thread {
        println("samThread")
    }.start()

    val answer = 42
    Thread { println("threadWithClosure => $answer") }.start()

    val executor = Executors.newFixedThreadPool(2)
    executor.submit(Callable {
        return@Callable 42
    })

    val isAnswer = Predicate<Int> { i -> i == 42 }
    println("accepted value is => ${isAnswer.accept(42)}")
}

fun doSomething(): Runnable = Runnable {
    // doing something
}

fun interface Predicate<T> {
    fun accept(element: T): Boolean
}