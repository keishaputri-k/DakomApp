package com.kei.dakomapp.util.network

import com.kei.dakomapp.model.ResponseLectures
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiEndPoint {
    @GET("data")
    fun getData(): Call<ResponseLectures>

    @GET("search")
    fun searchItem(@Query("search") data: String?): Call<ResponseLectures?>?
}