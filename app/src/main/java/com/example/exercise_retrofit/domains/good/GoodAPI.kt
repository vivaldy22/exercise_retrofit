package com.example.exercise_retrofit.domains.good

import com.example.exercise_retrofit.domains.response_data.ResponseData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GoodAPI {

    @GET("good/{id}")
    fun getGoodsByID(@Path("id") id: String): Call<ResponseData>

}