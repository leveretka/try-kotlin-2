package org.example

fun testString() {
    var stringInput: String? = null
    stringInput = ""
    try {
        println(stringInput.length)
        stringInput = null

        if (2 > 1) throw Exception()
        stringInput = ""
    } catch (exception: Exception) {
        println(stringInput?.length) // Warning in 1.9, but stringInput can be null
    }
}