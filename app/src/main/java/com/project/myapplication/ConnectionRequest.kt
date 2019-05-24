package com.project.myapplication

import android.util.Log
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response

class ConnectionRequest(private val requestQueue: RequestQueue) {
    private val url = "http:/www.collabgames.pl/scripts/external_communicator.php"

    private lateinit var connectionManager: ConnectionManager
    private var myResponse = "Connection failed"

    private fun makeConnection(){
        connectionManager = ConnectionManager(
            Request.Method.POST, url,
            Response.Listener { response ->
                Log.d("Request123", response)
                myResponse = response
            },
            Response.ErrorListener { error ->
                Log.d("Request123", error.message.toString())
                myResponse = error.message.toString()
            })
    }

    fun loginRequest(login: String, password: String): String {
        makeConnection()

        connectionManager.addParam("type", "login")
        connectionManager.addParam("value1", login)
        connectionManager.addParam("value2", password)

        requestQueue.add(connectionManager)

        return myResponse
    }

    fun registerRequest(login: String, email: String, password: String, short_desc: String, long_desc: String): String {
        makeConnection()

        connectionManager.addParam("type", "register")
        connectionManager.addParam("value1", login)
        connectionManager.addParam("value2", email)
        connectionManager.addParam("value3", password)
        connectionManager.addParam("value4", short_desc)
        connectionManager.addParam("value5", long_desc)

        requestQueue.add(connectionManager)

        return myResponse
    }
}