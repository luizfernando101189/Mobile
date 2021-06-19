package com.luiz.app2_sorteionumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var texto: TextView
    lateinit var SortearNumero: Button
    override fun onCreate ( savedInstanceState : Bundle? ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun SortearNumero(view: View) {
            var texto = findViewById(R.id.txtNumero)

            var numeroSorteado = Random().nextInt(11)

            texto.setText("O número é: $numeroSorteado")
        }
    }
}
