package org.example

interface Processor {
    fun process()
}

inline fun inlineAction(f: () -> Unit) = f()

fun nextProcessor(): Processor? = null

fun runProcessor(): Processor? {
    var processor: Processor? = null
    inlineAction {
        if (processor != null) {
            processor.process() // doesn't work in Kotlin 1.9 need processor?.process()
        }

        processor = nextProcessor()
    }

    return processor
}