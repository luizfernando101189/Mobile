package com.luiz.app4_alcoolgasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var resultadoAlcool: TextView
    lateinit var resultadoGasolina: TextView
    lateinit var botaoCalcular: button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultadoAlcool = findViewById(R.id.txtNumber)
        resultadoGasolina = findViewById(R.id.txtNumber2)
        botaoCalcular = findViewById(R.id.button)
        botaoCalcular.setOnClickListener{
            //aqui vai ser onde entra sequencia logica
        }
    }
}