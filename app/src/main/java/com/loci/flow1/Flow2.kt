package com.loci.flow1

import kotlinx.coroutines.*

suspend fun foo(): List<Int> {
    delay(1000) // pretend we are doing something asynchronous here
    return listOf(1, 2, 3)
}

fun main() = runBlocking<Unit> {

    foo().forEach {
            value -> println(value)
    }

}