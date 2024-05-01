package org.example

interface Provider {
    operator fun invoke()
}

interface MyProcessor : () -> String

class MyHolder(val provider: Provider?, val processor: MyProcessor?) {
    fun process() {
        if (provider != null) {
            provider() // doesn't work in 1.9
        }
    }
}