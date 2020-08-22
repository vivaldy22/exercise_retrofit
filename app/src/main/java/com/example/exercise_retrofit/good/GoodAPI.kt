package com.example.exercise_retrofit.good

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GoodAPI {

    @GET("good/{id}")
    fun getGoodsByID(@Path("id") id: String): Call<ResponseData>

}