package com.example.base_datos_room.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "agenda")
data class Agenda(
    @PrimaryKey(autoGenerate = true) val id:Int,
    @ColumnInfo(name = "nombre") val nombre: String,
    @ColumnInfo(name = "telefono") val telefono: String
)