package com.turbo.coroutine.composing

import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executors

class AsyncWorker(val writerFunction: (Pair<com.turbo.coroutine.composing.UserInput, String>) -> Int) {
    private val executor = Executors.newSingleThreadExecutor()

    fun submit(input: Pair<com.turbo.coroutine.composing.UserInput, String>): CompletableFuture<Int> =
      CompletableFuture.supplyAsync({ writerFunction(input) }, executor)
}