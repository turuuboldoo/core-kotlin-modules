package com.turbo.jvmfield

class JvmSample(text:String) {
    @JvmField
    val sampleText:String = text
}

class CompanionSample {
    companion object {
        @JvmField val MAX_LIMIT = 20
    }
}