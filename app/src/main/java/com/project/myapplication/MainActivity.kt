package com.project.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.project.myapplication.database.*

class MainActivity : AppCompatActivity() {

    //Internet connection request queue declaration. Each external call will be in this queue.
    private lateinit var requestQueue: RequestQueue
    private lateinit var worker: DbWorkerThread
    private var db: DatabaseModel? = null

    private val TAG = "QueryTag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestQueue = Volley.newRequestQueue(this)
        //Internet connection object initialization. Any external request will pass through this object.
        val connectionRequest = ConnectionRequest(requestQueue)

        //Login example
        //connectionRequest.loginRequest("QWERTY", "qwerty")

        //Select all people (first 20 results)
        //connectionRequest.searchRequest("People", "0", "0")

        worker = DbWorkerThread("worker")
        worker.start()

        db = DatabaseModel.getDatabase(this)
    }

    fun click(view: View)
    {
        val task = Runnable {
            val result = db?.databaseDao()?.testQuery()
            Log.d("tableSize ", result?.size.toString())
        }
        worker.postTask(task)
    }

    override fun onStop() {
        super.onStop()
        requestQueue.cancelAll(TAG)
    }
}
