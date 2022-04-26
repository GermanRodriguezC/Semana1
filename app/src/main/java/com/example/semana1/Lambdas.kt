package com.example.semana1

fun main(){
    var dirtyLevel = 20
    var water=2
    //val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    //println(waterFilter(dirtyLevel))
    //println(waterFilter(water))

    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    fun increaseDirty( start: Int ) = start + 1

    println(updateDirty(15, ::increaseDirty))

    dirtyLevel = 19;
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)

    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println(decorations.filter {it.contains('p')})

}