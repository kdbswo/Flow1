package com.loci.flow1

fun simple(): List<Int> = listOf(1,2,3)

fun main(){
    simple().forEach{
        value -> println(value)
    }
}