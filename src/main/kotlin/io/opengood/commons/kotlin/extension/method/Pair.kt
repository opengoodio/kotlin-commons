package io.opengood.commons.kotlin.extension.method

fun <K : Any, V : Any> Pair<K, V>.toEntry() =
    object : Map.Entry<K, V> {
        override val key: K = first
        override val value: V = second
    }
