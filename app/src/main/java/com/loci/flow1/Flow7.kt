package com.loci.flow1

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun main() = runBlocking<Unit> {

    (1..100).asFlow()
        .filter {
            it % 2 == 0
        }.collect {
            println("Collect $it")
        }

}