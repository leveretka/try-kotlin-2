package org.example

class Holder(val provider: (() -> Unit)?) {
    fun process() {
        if (provider != null) {
            provider() // doesn't work in 1.9
        }
    }
}