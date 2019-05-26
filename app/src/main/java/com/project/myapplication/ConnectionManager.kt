package com.project.myapplication

import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import java.util.*

//Volley library interface
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