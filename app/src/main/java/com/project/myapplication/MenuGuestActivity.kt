package com.project.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.project.myapplication.displayList.ProjectsListActivity

class MenuGuestActivity : AppCompatActivity() {

    private lateinit var requestQueue: RequestQueue
    private lateinit var connectionRequest: ConnectionRequest

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_guest)


        requestQueue = Volley.newRequestQueue(this)
    }

    fun prepareList() {
        val intent = Intent(this, ProjectsListActivity::class.java)
        connectionRequest = ConnectionRequest(requestQueue, object : ConnectionRequest.ConnectionRequestListener {
            override fun handlePostRequest(response: String) {
                intent.putExtra("projects", response)
                startActivity(intent)
            }
        })
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
}
