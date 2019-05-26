package com.project.myapplication.displayList

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.*
import com.project.myapplication.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken





class ProjectsListActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.project_list_activity)

        val projectsView: ListView = findViewById(R.id.projects_view)

        val intent = this.intent

        val json = intent.getStringExtra("projects")
        val token = object : TypeToken<ArrayList<ProjectItem>>() { }
        val projects = Gson().fromJson<ArrayList<ProjectItem>>(json, token.type)

        val adapter = ProjectItemAdapter(this, projects)
        projectsView.adapter = adapter
    }

}