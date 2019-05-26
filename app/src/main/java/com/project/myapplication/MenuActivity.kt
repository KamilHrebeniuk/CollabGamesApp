package com.project.myapplication

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.project.myapplication.displayList.ProjectsListActivity

private var preferences: SharedPreferences? = null

class MenuActivity : AppCompatActivity() {

    private lateinit var requestQueue: RequestQueue
    private lateinit var connectionRequest: ConnectionRequest
    private val PREFERENCESNAME = "CollabGamesSettings"
    private val USERID = "UserID"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        requestQueue = Volley.newRequestQueue(this)
        preferences = getSharedPreferences(PREFERENCESNAME, Activity.MODE_PRIVATE)
    }

    private fun prepareList() {
        val intent = Intent(this, ProjectsListActivity::class.java)
        connectionRequest = ConnectionRequest(requestQueue, object : ConnectionRequest.ConnectionRequestListener {
            override fun handlePostRequest(response: String) {
                intent.putExtra("projects", response)
                startActivity(intent)
            }
        })
    }

    fun runAttendance(view: View) {
        prepareList()
        connectionRequest.searchRequest("Project", "0", "0")
    }

    fun runPeople(view: View) {
        prepareList()
        connectionRequest.searchRequest("People", "0", "0")
    }

    fun runTeam(view: View) {
        prepareList()
        connectionRequest.searchRequest("Team", "0", "0")
    }

    fun runProject(view: View) {
        prepareList()
        connectionRequest.searchRequest("Project", "0", "0")
    }

    fun logOut(view: View) {
        val preferencesEditor = preferences!!.edit()
        preferencesEditor.putInt(USERID, 0)
        preferencesEditor.apply()
        Toast.makeText(this@MenuActivity, "Logged Out", Toast.LENGTH_LONG).show()


        this.finishAffinity()
    }
}