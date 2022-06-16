package com.checho.android_desing_patters.factoryPattern

class Vegetarian : Ipizza {

    override fun name(): String {
        return("Pizza Vegetariana")
    }

    override fun calories(): String {
        return("999 Kcal")
    }

}