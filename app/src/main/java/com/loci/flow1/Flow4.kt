package com.loci.flow1

// Flow 는 Cold Stream 이다

// Cold Stream -> 수도꼭지 -> 내가 틀면 물이 나온다
// Hot Stream -> 냇가(계곡) -> 그냥 물이 흐르고 있다

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun foo1(): Flow<Int> = flow {
    println("Flow started")
    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}

fun main() = runBlocking<Unit> {
    println("Calling foo...")
    val flow = foo1()
    println("Calling collect...")
    flow.collect {
            value -> println(value)
    }
}