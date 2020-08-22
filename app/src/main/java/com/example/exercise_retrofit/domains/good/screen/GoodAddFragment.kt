package com.example.exercise_retrofit.domains.good.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.exercise_retrofit.R
import com.example.exercise_retrofit.domains.good.Good
import com.example.exercise_retrofit.domains.good.GoodViewModel

class GoodAddFragment : Fragment() {

    private val goodViewModel by activityViewModels<GoodViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_good_add, container, false)
    }

    fun createGood(view: View) {
        goodViewModel.createGood(Good())
    }
}