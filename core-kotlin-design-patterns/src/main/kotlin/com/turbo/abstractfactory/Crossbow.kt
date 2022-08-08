package com.turbo.abstractfactory

class Crossbow : Weapon {

    companion object Factory : WeaponFactory() {
        override fun buildWeapon() = Crossbow()
    }

    override fun use(): String {
        return "Using crossbow weapon"
    }
}