package com.project.myapplication.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface DatabaseDao {
    @Query("SELECT * FROM globalID")
    fun testQuery(): Array<GlobalIDTable>

    @Insert
    fun insert(global: GlobalIDTable)
}