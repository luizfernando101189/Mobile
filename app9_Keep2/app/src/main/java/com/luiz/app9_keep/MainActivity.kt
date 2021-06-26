package com.luiz.app9_keep

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)

        val lista = mutableListOf<Usuario>(
            Usuario(Texto="Lorem ipsum dolor sit amet consectetur adipiscing elit fringilla, cubilia sodales torquent non pharetra posuere ex consequat, donec lectus per vehicula purus tristique nisl. Tortor taciti cubilia nam lacinia accumsan euismod facilisis, integer mauris sagittis interdum justo morbi ut erat, neque fermentum tempus varius parturient sodales. Feugiat montes sociosqu ad venenatis mi taciti praesent morbi id, rutrum aliquam sollicitudin facilisis cursus aliquet vulputate sed, ultricies lorem nulla diam per tempor conubia potenti. Iaculis sollicitudin dictum cursus aptent ultricies ullamcorper nisl praesent pulvinar, duis inceptos facilisis penatibus posuere libero fames aliquam, tincidunt nec per arcu tempor tortor venenatis pharetra. Nunc integer dictumst fusce nec purus vehicula torquent commodo potenti, cursus sollicitudin vel at natoque nulla pellentesque orci elementum venenatis, ligula curae auctor convallis feugiat platea condimentum sit. Torquent lectus nulla fringilla fames ante viverra, nec ex velit cubilia venenatis conubia, sollicitudin a risus laoreet dis. Aliquet eleifend habitant rhoncus aptent lorem magnis dapibus tortor, magna donec arcu luctus porta tellus posuere torquent, lectus varius tempus semper ac orci natoque. A urna eleifend nibh parturient finibus habitant consequat quis dis vestibulum, curabitur cras condimentum natoque posuere et vel nostra quisque, curae nulla justo efficitur inceptos libero pellentesque aptent class. Facilisis massa ac hendrerit in natoque leo pharetra dignissim non, turpis justo interdum torquent erat habitasse blandit faucibus ad aliquet, quis tortor ex neque lacinia quisque at vitae. Parturient maximus quisque magna amet platea lorem malesuada nibh varius tristique, leo etiam ullamcorper consequat hendrerit quam in pretium. Vitae pulvinar eu nullam venenatis suspendisse laoreet maecenas leo fusce tincidunt, quam amet ullamcorper habitant sed facilisis facilisi imperdiet luctus ipsum, vehicula massa netus bibendum sit placerat integer varius purus."),
            Usuario(Texto="Lorem ipsum dolor sit amet consectetur adipiscing elit montes est tellus, mollis turpis habitasse metus lacinia interdum venenatis nulla fringilla cras"),
            Usuario(Texto="ex sagittis suspendisse et natoque quis taciti pharetra nullam. Donec dapibus fusce litora interdum parturient rutrum cras natoque varius, ultrices vitae accumsan aptent phasellus bibendum dictum cursus congue potenti"))
        rv.adapter = UsuarioAdapter(lista)

// Exibe os itens em uma coluna única no padrão vertical
        rv.layoutManager = LinearLayoutManager(this)

// Exibe os itens em uma coluna única no padrão horizontal
// rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

// Exibe os itens em uma tabela com x colunas
// rv.layoutManager = GridLayoutManager(this, 2)

// Exibe os itens em uma tabela porém as células são ajustadas automaticamente de acordo com o conteúdo (Google Keep, Pintrest)
// rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

    }
}
