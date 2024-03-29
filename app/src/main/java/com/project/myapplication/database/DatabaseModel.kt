package com.project.myapplication.database

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import java.util.concurrent.Executors

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
        private val IO_EXECUTOR = Executors.newSingleThreadExecutor()

        fun ioThread(f: () -> Unit)
        {
            IO_EXECUTOR.execute(f)
        }

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
                ).addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        ioThread {
                            Log.d("database", "Creation started")
                            val dao = getDatabase(context).databaseDao()
                            dao.insertAll(*GlobalIDTable.populateEntity())
                            dao.insertAll(*LogTable.populateEntity())
                            dao.insertAll(*PeopleTable.populateEntity())
                            dao.insertAll(*PersonalHistoryTable.populateEntity())
                            dao.insertAll(*ProjectsTable.populateEntity())
                            dao.insertAll(*TagsTable.populateEntity())
                            dao.insertAll(*ProjectTagsTable.populateEntity())
                            dao.insertAll(*ProjectWorkersTable.populateEntity())
                            dao.insertAll(*TeamsTable.populateEntity())
                            dao.insertAll(*TeamMembersTable.populateEntity())
                            Log.d("database", "creation ended")
                        }
                    }
                }).build()
                ioThread { getDatabase(context).databaseDao().initialQuery() }
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
