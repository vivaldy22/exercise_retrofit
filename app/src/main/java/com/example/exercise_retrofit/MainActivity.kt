package com.example.exercise_retrofit

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.exercise_retrofit.domains.good.GoodViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val goodViewModel by viewModels<GoodViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goodViewModel.good.observe(this, Observer {
            goodNameText.text = it.name
        })
    }

    fun getGood(view: View) {
        goodViewModel.getGoodByID(goodIDInputText.text.toString())
    }
}