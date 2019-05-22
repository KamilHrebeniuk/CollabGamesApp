package com.project.myapplication.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context
import android.os.Handler
import android.os.HandlerThread

@Database(entities = [ProjectsTable::class, TagsTable::class, TeamsTable::class,
                      PeopleTable::class, GlobalIDTable::class, ProjectTagsTable::class, ProjectWorkersTable::class,
                      TeamMembersTable::class, PersonalHistoryTable::class, LogTable::class, PresenceTable::class],
          version = 1)
@TypeConverters(Converters::class)
abstract class DatabaseModel : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao
    companion object {
        @Volatile
        private var INSTANCE: DatabaseModel? = null

        fun getDatabase(context: Context): DatabaseModel {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DatabaseModel::class.java,
                    "Database.db"
                ).build()
                INSTANCE = instance
                return instance
            }
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}

class DbWorkerThread(threadName: String) : HandlerThread(threadName)
{
    private lateinit var workerHandler: Handler

    override fun onLooperPrepared() {
        super.onLooperPrepared()
        workerHandler = Handler(looper)
    }

    fun postTask(task: Runnable) {
        workerHandler.post(task)
    }
}
