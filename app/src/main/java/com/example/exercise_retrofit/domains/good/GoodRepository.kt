package com.example.exercise_retrofit.domains.good

import androidx.lifecycle.MutableLiveData
import com.example.exercise_retrofit.domains.response_data.ResponseData
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GoodRepository(val goodAPI: GoodAPI) {

    val good: MutableLiveData<Good> = MutableLiveData<Good>()

    fun getGoodByID(id: String) {
        goodAPI.getGoodsByID(id).enqueue(object : Callback<ResponseData> {
            override fun onResponse(call: Call<ResponseData>, response: Response<ResponseData>) {
                val responseData = response.body()

                if (responseData?.status == "OK") {
                    val res = responseData.result
                    val gson = Gson()
                    good.value = gson.fromJson(gson.toJson(res), Good::class.java)
                } else {
                    good.value = Good("", "Data not found", "")
//                    println("[ERROR] Data not found")
                }
            }

            override fun onFailure(call: Call<ResponseData>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }

    fun createGood(good: Good) {
        goodAPI.createGood(good).enqueue(object : Callback<ResponseData> {
            override fun onResponse(call: Call<ResponseData>, response: Response<ResponseData>) {
                val responseData = response.body()

                if (responseData?.status == "OK") {

                }
            }

            override fun onFailure(call: Call<ResponseData>, t: Throwable) {
                t.printStackTrace()
            }

        })
    }

}