package com.loci.flow1

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun simple1(): Flow<Int> = flow { // flow builder
    for (i in 1..3) {
        delay(100) // pretend we are doing something useful here
        println("delay(100)")
        emit(i) // emit next value
    }
}

fun main() = runBlocking<Unit> {

    // Collect the flow
    simple1().collect {
            value -> println(value)
    }
}