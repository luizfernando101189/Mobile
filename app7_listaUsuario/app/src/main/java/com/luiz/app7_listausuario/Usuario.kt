package com.luiz.app7_listausuario

import android.graphics.drawable.Drawable

data class Usuario(
    var foto: Drawable?=null,
    var nome: String,
    var email: String,
    var stack: Stack,
    var senioridade: Senioridade
)
