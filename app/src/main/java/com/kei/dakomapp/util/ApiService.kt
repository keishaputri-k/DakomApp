package com.kei.dakomapp.util

import com.google.gson.GsonBuilder
import com.kei.dakomapp.room.FavDao
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiService{
    companion object{
        const val BASE_URL = "https://dakom.smkidnakhwat.com/api"
        private var launchRepository: ApiService? = null

        val endpoint: ApiService
            get() {
                val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(
                        GsonConverterFactory.create(
                            GsonBuilder().setLenient().create()
                        )
                    )
                    .build()
                return retrofit.create(ApiService::class.java)
            }
    }
}