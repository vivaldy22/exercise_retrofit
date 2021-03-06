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
                val res = responseData?.result
                val gson = Gson()
                good.value = gson.fromJson(gson.toJson(res), Good::class.java)
            }

            override fun onFailure(call: Call<ResponseData>, t: Throwable) {
                println(t.localizedMessage)
            }
        })
    }

}