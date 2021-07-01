package com.luiz.app10_devscadastro

import android.graphics.Bitmap
import android.graphics.drawable.Drawable

data class Usuario(
    var foto: Bitmap?=null,
    var nome: String,
    var email: String,
    var stack: Stack,
    var senioridade: Senioridade,
    var empregado: Boolean
)
