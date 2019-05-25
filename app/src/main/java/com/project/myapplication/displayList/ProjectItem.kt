package com.project.myapplication.displayList

import java.io.Serializable

data class ProjectItem(var URL: String,
                       var globalID: String,
                       var name: String,
                       var status: String,
                       var start_date: String,
                       var end_date: String,
                       var short_desc: String,
                       var long_desc: String
) : Serializable