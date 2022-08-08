@file:JvmName("Strings")
package com.turbo.kotlin

fun String.escapeForXml() : String {
    return this
            .replace("&", "&amp;")
            .replace("<", "&lt;")
            .replace(">", "&gt;")
}
