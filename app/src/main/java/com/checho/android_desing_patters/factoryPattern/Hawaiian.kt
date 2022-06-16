package com.checho.android_desing_patters.factoryPattern

class Hawaiian : Ipizza {

    override fun name(): String {
        return("Pizza Hawaiana")
    }

    override fun calories(): String {
        return("333 Kcal")
    }

}