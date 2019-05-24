package com.project.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.project.myapplication.database.*

class MainActivity : AppCompatActivity() {

    private lateinit var worker: DbWorkerThread
    private var db: DatabaseModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        worker = DbWorkerThread("worker")
        worker.start()

        db = DatabaseModel.getDatabase(this)

        val task = Runnable {
            val result = db?.databaseDao()?.testQuery()
            Log.d("tableSize ", result?.size.toString())
        }
        //worker.postTask(task)
        DatabaseModel.destroyInstance()
    }
}
