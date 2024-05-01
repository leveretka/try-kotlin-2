package org.example

fun f(x: Any) {

    when(x) {
        is String && x.length > 5 -> println(x) // Not compiling
    }

    when(x) {
        is String -> if (x.length > 5) println(x) // Nested if
    }

    when(x) {
        is String if (x.length > 5) -> println(x) // Potential future, 2.2?
    }

}