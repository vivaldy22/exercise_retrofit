package com.example.exercise_retrofit.domains.good

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.exercise_retrofit.config.RetrofitBuilder

class GoodViewModel : ViewModel() {

    private val goodRepository: GoodRepository

    init {
        val goodsAPI = RetrofitBuilder.createRetrofit().create(GoodAPI::class.java)
        goodRepository = GoodRepository(goodsAPI)
    }

    val good: LiveData<Good> = goodRepository.good

    fun getGoodByID(id: String) {
        goodRepository.getGoodByID(id)
    }

    fun createGood(good: Good) {
        goodRepository.createGood(good)
    }
}
