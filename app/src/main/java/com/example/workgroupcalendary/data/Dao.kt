package com.example.workgroupcalendary.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Insert
    fun incertUser (users: Users)
    @Query("SELECT * FROM items")
    fun getAllUsers(): Flow<List<Users>>
}