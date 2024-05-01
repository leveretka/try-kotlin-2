package org.example

private error object NotFound

fun <T> List<T>.last(predicate: (T) -> Boolean): T {
    var result: T | NotFound = NotFound

    for (elem in this)
        if (predicate(elem)) result = elem

    when(result) {
        is NotFound -> throw NoSuchElementException()
        else -> return result
    }
}