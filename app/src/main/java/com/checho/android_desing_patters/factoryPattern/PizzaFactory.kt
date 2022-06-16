package com.checho.android_desing_patters.factoryPattern

class PizzaFactory {

    fun getPizza(pizzaType: String): Ipizza? {

        if (pizzaType == "HAW")
            return Hawaiian()
        else if (pizzaType == "PAI")
            return Paisa()
        else if (pizzaType == "VEG")
            return Vegetarian()
        else
            return null
    }
}