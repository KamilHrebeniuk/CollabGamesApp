package com.project.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.project.myapplication.database.DatabaseModel
import com.project.myapplication.database.DbWorkerThread
import com.project.myapplication.displayList.ProjectsListActivity


class MainActivity : AppCompatActivity() {

    //Internet connection request queue declaration. Each external call will be in this queue.
    private lateinit var requestQueue: RequestQueue
    private lateinit var worker: DbWorkerThread
    private var db: DatabaseModel? = null
    private var TAG = MainActivity::class.java.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestQueue = Volley.newRequestQueue(this)
        //Internet connection object initialization. Any external request will pass through this object.

        //Login example
        //connectionRequest.loginRequest("QWERTY", "qwerty")

        //Select all people (first 20 results)
//        connectionRequest.searchRequest("People", "0", "0")

//        worker = DbWorkerThread("worker")
//        worker.start()
//
//        db = DatabaseModel.getDatabase(this)

    }

    fun login(view: View) {

    }

    fun goToRegister(view: View) {
        Log.v("Activity123", "Start register")
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    fun visitAsGuest(view: View) {
        Log.v("Activity123", "Start main menu")
        /*    val task = Runnable {
                val result = db?.databaseDao()?.testQuery()
                Log.d("tableSize ", result?.size.toString())
            }
            worker.postTask(task)*/

        //Start Activity with Search
        val intent = Intent(this, ProjectsListActivity::class.java)

        val connectionRequest = ConnectionRequest(requestQueue, object : ConnectionRequest.ConnectionRequestListener {
            override fun handlePostRequest(response: String) {
                intent.putExtra("projects", response)
                startActivity(intent)
            }
        })
        connectionRequest.searchRequest("People", "0", "0")


    }

    override fun onStop() {
        super.onStop()
        requestQueue.cancelAll(TAG)
    }
}
