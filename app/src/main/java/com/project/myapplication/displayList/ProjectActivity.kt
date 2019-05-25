package com.project.myapplication.displayList

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.project.myapplication.R

class ProjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.project_activity)

        val view = findViewById<LinearLayout>(R.id.project_activity_layout)

        val intent = this.intent

        val json = intent.getStringExtra("project")
        val token = object : TypeToken<ProjectItem>() {}
        val project = Gson().fromJson<ProjectItem>(json, token.type)


        view.findViewById<TextView>(R.id.name).text = project.name
        view.findViewById<TextView>(R.id.description).text = project.short_desc
        view.findViewById<TextView>(R.id.description_full).text = project.long_desc
        view.findViewById<TextView>(R.id.status).text = project.status
        view.findViewById<TextView>(R.id.start).text = project.start_date
    }
}