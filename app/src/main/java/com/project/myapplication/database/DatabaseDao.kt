package com.project.myapplication.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

@Dao
interface DatabaseDao {
    @Query("SELECT * FROM globalID")
    fun testQuery(): Array<GlobalIDTable>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertAll(vararg objects: GlobalIDTable)
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertAll(vararg objects: LogTable)
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertAll(vararg objects: PeopleTable)
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertAll(vararg objects: PersonalHistoryTable)
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertAll(vararg objects: ProjectsTable)
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertAll(vararg objects: ProjectTagsTable)
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertAll(vararg objects: ProjectWorkersTable)
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertAll(vararg objects: TagsTable)
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertAll(vararg objects: TeamMembersTable)
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertAll(vararg objects: TeamsTable)
}