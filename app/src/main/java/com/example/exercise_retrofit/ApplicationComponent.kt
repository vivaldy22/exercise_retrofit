package com.example.exercise_retrofit

import com.example.exercise_retrofit.domains.good.screen.GoodAddFragment
import com.example.exercise_retrofit.domains.good.screen.GoodFragment
import dagger.Component

@Component
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(goodFragment: GoodFragment)
    fun inject(goodAddFragment: GoodAddFragment)

}