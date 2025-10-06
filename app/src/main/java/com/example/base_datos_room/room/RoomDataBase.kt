package com.example.base_datos_room.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.base_datos_room.model.Agenda

@Database(entities = [Agenda::class],version=1, exportSchema = false)
abstract  class RoomDataBase : RoomDatabase(){
    abstract fun agendaDao(): AgendaDatabaseDAO
}
