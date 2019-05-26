package com.project.myapplication

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.project.myapplication.database.DatabaseModel
import com.project.myapplication.database.DbWorkerThread
import com.project.myapplication.displayList.LoginItem

private var preferences: SharedPreferences? = null

class MainActivity : AppCompatActivity() {

    private val PREFERENCESNAME = "CollabGamesSettings"
    private val USERID = "UserID"

    //Internet connection request queue declaration. Each external call will be in this queue.
    private lateinit var requestQueue: RequestQueue
    private lateinit var worker: DbWorkerThread
    private var db: DatabaseModel? = null
    private var TAG = MainActivity::class.java.simpleName
    var globalID = 0

    override fun onResume() {
        super.onResume()
        restoreData()
    }

    override fun onPause() {
        super.onPause()
        saveData()
    }

    private fun saveData() {
        val preferencesEditor = preferences!!.edit()
        preferencesEditor.putInt(USERID, globalID)
        preferencesEditor.apply()
    }

    private fun restoreData() {
        globalID = preferences!!.getInt(USERID, 0)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestQueue = Volley.newRequestQueue(this)
        preferences = getSharedPreferences(PREFERENCESNAME, Activity.MODE_PRIVATE)
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


    fun visitAsUser(view: View) {
        if (globalID > 0) {
            val intent = Intent(this, MenuActivity::class.java)
            intent.putExtra("globalID", globalID)
            startActivity(intent)
        } else {
            val intent = Intent(this, MenuActivity::class.java)
            val connectionRequest =
                ConnectionRequest(requestQueue, object : ConnectionRequest.ConnectionRequestListener {
                    override fun handlePostRequest(response: String) {
                        val token = object : TypeToken<LoginItem>() {}
                        val login = Gson().fromJson<LoginItem>(response, token.type)
                        if (login.state == "Success") {
                            if (login.globalID.toInt() > 0) {
                                globalID = login.globalID.toInt()
                                intent.putExtra("globalID", globalID)
                                startActivity(intent)
                            }
                        } else {
                            Toast.makeText(this@MainActivity, "Login or password is incorrect", Toast.LENGTH_LONG)
                                .show()
                        }
                    }
                })
            connectionRequest.loginRequest(
                findViewById<EditText>(R.id.username).text.toString(),
                findViewById<EditText>(R.id.password).text.toString()
            )
        }
    }

    fun goToRegister(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    fun visitAsGuest(view: View) {
        val intent = Intent(this, MenuGuestActivity::class.java)
        startActivity(intent)
    }

    /*   fun visitAsGuest(view: View) {
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
       }*/

    override fun onStop() {
        super.onStop()
        requestQueue.cancelAll(TAG)
    }
}
