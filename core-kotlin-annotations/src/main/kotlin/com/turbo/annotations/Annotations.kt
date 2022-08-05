package com.turbo.annotations

@Target(AnnotationTarget.FIELD)
annotation class Positive

@Target(AnnotationTarget.FIELD)
annotation class AllowedNames(val names: Array<String>)
