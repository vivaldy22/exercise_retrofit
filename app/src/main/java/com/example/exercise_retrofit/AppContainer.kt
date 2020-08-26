package com.example.exercise_retrofit

import com.example.exercise_retrofit.config.RetrofitBuilder
import com.example.exercise_retrofit.domains.good.GoodAPI
import com.example.exercise_retrofit.domains.good.GoodRepository
import com.example.exercise_retrofit.domains.good.GoodViewModel
import com.example.exercise_retrofit.domains.warehouse.WarehouseViewModel

class AppContainer {

//    private val goodAPI: GoodAPI = RetrofitBuilder.createRetrofit().create(GoodAPI::class.java)
//    private val goodRepository = GoodRepository(goodAPI)
//    val goodViewModel = GoodViewModel(goodRepository)
//    val goodViewModelFactory = GoodViewModelFactory(goodRepository)
}

//class GoodViewModelFactory(private val goodRepository: GoodRepository): Factory<GoodViewModel> {
//    override fun create(): GoodViewModel {
//        return GoodViewModel(goodRepository)
//    }
//}
//
//class WarehouseViewModelFactory(): Factory<WarehouseViewModel> {
//    override fun create(): WarehouseViewModel {
//        TODO("Not yet implemented")
//    }
//
//}
//
//interface Factory<T> {
//    fun create(): T
//}
