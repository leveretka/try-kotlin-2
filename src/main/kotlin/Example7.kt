package org.example

interface Rho {
    operator fun inc(): Sigma = TODO()
}

interface Sigma : Rho {
    fun sigma() = Unit
}

interface Tau {
    fun tau() = Unit
}

fun main(input: Rho) {
    var unknownObject: Rho = input

    if (unknownObject is Tau) {

        ++unknownObject
        unknownObject.sigma() // error in 1.9 but the type is Sigma
        // unknownObject.tau() // correct in 1.9 but should be error
    }
}