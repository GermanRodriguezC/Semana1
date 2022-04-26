package com.example.semana1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Example1:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.example1)

        val textView=findViewById<TextView>(R.id.tvHelloEx1)
        textView.text="Hola mundo desde Example1"
    }
}
