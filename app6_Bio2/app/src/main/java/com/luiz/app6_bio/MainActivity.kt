package com.luiz.app6_bio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var botaoMeta: Button
    private lateinit var botaoCaminho: Button
    private lateinit var botaoMotivacao: Button
    private lateinit var botaoConquista: Button
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
     setContentView(R.layout.activity_main)
     botaoMeta = findViewById(R.id.btnMeta)
     botaoCaminho = findViewById(R.id.btnCaminho)
     botaoMotivacao = findViewById(R.id.btnMotivacao)
     botaoConquista = findViewById(R.id.btnConquista)

     botaoMeta.setOnClickListener {
     val intentMeta = Intent(this@MainActivity, MetaAct::class.java)
     startActivity(intentMeta)}
     botaoCaminho.setOnClickListener {
     val intentCaminho = Intent(this@MainActivity, CaminhoAct::class.java)
     startActivity(intentCaminho)}
     botaoMotivacao.setOnClickListener {
     val intentMotivacao = Intent(this@MainActivity, MotivacaoAct::class.java)
     startActivity(intentMotivacao)}
     botaoConquista.setOnClickListener {
     val intentConquista = Intent(this@MainActivity, ConquistaAct::class.java)
     startActivity(intentConquista)
        }
    }
}
