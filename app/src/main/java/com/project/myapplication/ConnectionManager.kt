package com.project.myapplication

import android.util.Log
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest

import java.util.HashMap

class ConnectionManager(
    method: Int,
    url: String,
    listener: Response.Listener<String>,
    errorListener: Response.ErrorListener
) : StringRequest(method, url, listener, errorListener) {

    private var params: MutableMap<String, String> = HashMap()

    fun addParam(arg: String, value: String) {
        params[arg] = value
    }

    fun addParams(map: Map<String, String>) {
        this.params.putAll(map)
    }

    public override fun getParams(): Map<String, String> {
        return params
    }
}