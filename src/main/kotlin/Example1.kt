package org.example

class Cat {
    fun purr() {
        println("Purr purr")
    }
}

fun petAnimal(animal: Any) {
    val isCat = animal is Cat
    if (isCat) {
        animal.purr() // doesn't work in 1.9
    }
}

fun main(){
    val kitty = Cat()
    petAnimal(kitty)
    // Purr purr
}