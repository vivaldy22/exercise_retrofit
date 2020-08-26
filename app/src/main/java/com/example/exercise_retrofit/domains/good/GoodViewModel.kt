package com.example.exercise_retrofit.domains.good

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.exercise_retrofit.config.RetrofitBuilder
import javax.inject.Inject

class GoodViewModel @Inject constructor(private val goodRepository: GoodRepository) : ViewModel() {

    val good: LiveData<Good> = goodRepository.good

    fun getGoodByID(id: String) {
        goodRepository.getGoodByID(id)
    }

    fun createGood(good: Good) {
        goodRepository.createGood(good)
    }
}
