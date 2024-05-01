package org.example

class MyHolder {
    private val _list = mutableListOf<String>()
    val list: List<String>
        get() = _list
}

// Future: explicit backing fields, could be named
class MyHolder2 {
    val list: List<String>
        field = mutableListOf<String>()
}
