package com.example.exercise_retrofit.domains.good.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.exercise_retrofit.R
import com.example.exercise_retrofit.domains.good.GoodViewModel
import kotlinx.android.synthetic.main.fragment_good.*

class GoodFragment : Fragment(), View.OnClickListener {

    private val goodViewModel by activityViewModels<GoodViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_good, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goodViewModel.good.observe(viewLifecycleOwner, Observer {
            goodNameText.text = it.name
        })
        fetchButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            fetchButton -> getGoodByID()
        }
    }

    private fun getGoodByID() {
        goodViewModel.getGoodByID(goodIDInputText.text.toString())
    }
}