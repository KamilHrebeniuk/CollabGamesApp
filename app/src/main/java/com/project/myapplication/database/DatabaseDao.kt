package com.project.myapplication.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface DatabaseDao {
    @Query("SELECT * FROM globalID")
    fun testQuery(): Array<GlobalIDTable>

    @Insert
    fun insertAll(vararg objects: GlobalIDTable)
    @Insert
    fun insertAll(vararg objects: LogTable)
    @Insert
    fun insertAll(vararg objects: PeopleTable)
    @Insert
    fun insertAll(vararg objects: PersonalHistoryTable)
    @Insert
    fun insertAll(vararg objects: ProjectsTable)
    @Insert
    fun insertAll(vararg objects: ProjectTagsTable)
    @Insert
    fun insertAll(vararg objects: ProjectWorkersTable)
    @Insert
    fun insertAll(vararg objects: TagsTable)
    @Insert
    fun insertAll(vararg objects: TeamMembersTable)
    @Insert
    fun insertAll(vararg objects: TeamsTable)
}