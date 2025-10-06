package com.example.base_datos_room.room

import androidx.room.Query
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Dao
import androidx.room.OnConflictStrategy
import androidx.room.Update
import com.example.base_datos_room.model.Agenda


interface AgendaDatabaseDAO {
    //CRUD

    @Query(value = "Select * from agenda")
    fun getAll(): List<Agenda>

    @Query(value = "Select * from agenda where id = :id")
    fun getById(id:Int): List<Agenda>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun Insert(agenda:Agenda)

    @Update (onConflict = OnConflictStrategy.REPLACE)
    fun Update(agenda:Agenda)

    @Delete
    fun Delete(agenda:Agenda)

}