package com.project.myapplication.displayList

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import com.google.gson.Gson
import com.project.myapplication.R

class ProjectItemAdapter(
    private val context: Context,
    val array: ArrayList<ProjectItem>) : BaseAdapter() {

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = inflater.inflate(R.layout.project_item,null)
        val name = view.findViewById(R.id.name) as TextView
        val description = view.findViewById(R.id.description) as TextView

        name.text = array[position].name
        description.text = array[position].short_desc

        view.findViewById<Button>(R.id.project_button).setOnClickListener {
            val intent = Intent(context, ProjectActivity::class.java)
            val json = Gson().toJson(array[position])
            intent.putExtra("project", json)
            context.startActivity(intent)
        }


        return view
    }

    override fun getCount(): Int {
        return array.size
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getItem(position: Int): Any {
        return array[position]
    }

}