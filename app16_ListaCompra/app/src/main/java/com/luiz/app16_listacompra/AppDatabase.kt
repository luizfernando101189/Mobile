package com.luiz.app16_listacompra

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Compra::class), version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun compraDao():CompraDAO
}