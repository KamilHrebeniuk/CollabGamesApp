package com.project.myapplication

import android.util.Log
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response

//This class contains all connection methods. All outputs of public methods are JSONs. First field of JSON output is state -> "Success" or "Error" for login, register and presence queries
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

    //Takes login, password gives JSON {state, globalID}.
    // globalID is universal ID which could belong to user, team od project.
    fun loginRequest(login: String, password: String): String {
        makeConnection()

        connectionManager.addParam("type", "login")
        connectionManager.addParam("value1", login)
        connectionManager.addParam("value2", password)

        requestQueue.add(connectionManager)

        return myResponse
    }

    //Takes login, email, password, short description, long description gives JSON {state}.
    //Login doesn't happened automatically.
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

    //Takes target (Project, Team, People), query (or 0 to search all), page (one page means 20 results, first page is 0) gives JSON array of {URL, globalID, name, status, start_date, end_Date, short_desc, long_desc}.
    fun searchRequest(target: String, query: String, page: String): String{
        makeConnection()

        connectionManager.addParam("type", "search")
        connectionManager.addParam("value1", target)
        connectionManager.addParam("value2", query)
        connectionManager.addParam("value3", page)

        requestQueue.add(connectionManager)

        return myResponse
    }
}