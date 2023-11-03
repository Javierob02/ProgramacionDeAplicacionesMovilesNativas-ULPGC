package com.example.busschedule.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Schedule") //Añadimos nombre de Tabla
data class BusSchedule( //Se le aññade 'data' y parámetros a los campos junto a sus nombre de columna
    @PrimaryKey
    val id: Int,    //id: Primary Key
    @NonNull
    @ColumnInfo(name = "stop_name")
    val stopName: String,   //stopName: NoNull con nombre "stop_name"
    @NonNull
    @ColumnInfo(name = "arrival_time")
    val arrivalTimeInMillis: Int   //arrivalTimeInMillis: NoNull con nombre "arrival_time"
)
