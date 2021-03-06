package io.opengood.commons.kotlin.function

import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun captureStdOut(func: () -> Unit): String {
    val stdOut = System.out
    val outputStream = ByteArrayOutputStream()
    val printStream = PrintStream(outputStream)

    System.setOut(printStream)
    func()
    System.out.flush()
    System.setOut(stdOut)

    return outputStream.toString()
}
