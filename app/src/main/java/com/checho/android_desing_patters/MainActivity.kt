package com.checho.android_desing_patters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.checho.android_desing_patters.factoryPattern.PizzaFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView: TextView = findViewById(R.id.text_view)

        val pizzaFactory = PizzaFactory()
        val pizza = pizzaFactory.getPizza("VEG")

        if (pizza != null) {
            textView.setText(StringBuilder()
                .append(pizza.name())
                .toString()
            )
        }




    }
}