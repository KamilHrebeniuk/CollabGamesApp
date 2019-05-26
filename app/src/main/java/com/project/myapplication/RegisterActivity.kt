package com.project.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.project.myapplication.displayList.RegisterItem


class RegisterActivity : AppCompatActivity() {
    private lateinit var requestQueue: RequestQueue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        requestQueue = Volley.newRequestQueue(this)
    }

    fun register(view: View) {
        val intent = Intent(this, MenuActivity::class.java)
        val connectionRequest =
            ConnectionRequest(requestQueue, object : ConnectionRequest.ConnectionRequestListener {
                override fun handlePostRequest(response: String) {
                    val token = object : TypeToken<RegisterItem>() {}
                    val register = Gson().fromJson<RegisterItem>(response, token.type)
                    if (register.state == "Success") {
                        Toast.makeText(this@RegisterActivity, "Account Created!", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this@RegisterActivity, "Something went wrong", Toast.LENGTH_LONG).show()
                    }
                }
            })
        connectionRequest.registerRequest(
            findViewById<EditText>(R.id.registrationNick).text.toString(),
            findViewById<EditText>(R.id.registrationEmail).text.toString(),
            findViewById<EditText>(R.id.registrationPassword).text.toString(),
            findViewById<EditText>(R.id.registrationShortDescription).text.toString(),
            "LongDesc"
        )
    }

}