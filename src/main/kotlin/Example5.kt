package org.example

interface Provider {
    operator fun invoke()
}

interface MyProcessor : () -> String

private class Holder2(val provider: Provider?, val processor: MyProcessor?) {
    fun process() {
        if (provider != null) {
            provider() // doesn't work in 1.9
        }
    }
}