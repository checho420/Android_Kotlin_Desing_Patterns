package com.checho.android_desing_patters.factoryPattern

class Paisa : Ipizza {

    override fun name(): String {
        return ("Pizza Paisa")
    }

    override fun calories(): String {
        return("666 Kcal")
    }

}