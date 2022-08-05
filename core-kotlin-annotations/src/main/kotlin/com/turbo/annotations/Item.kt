package com.turbo.annotations

class Item(@Positive val amount: Float, @AllowedNames(["Alice", "Bob"]) val name: String)