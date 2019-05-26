package com.project.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        Log.v("Activity123", "Start")
    }

}