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
import com.example.exercise_retrofit.AppContainer
import com.example.exercise_retrofit.MainActivity
import com.example.exercise_retrofit.MyApplication
import com.example.exercise_retrofit.R
import com.example.exercise_retrofit.domains.good.GoodViewModel
import kotlinx.android.synthetic.main.fragment_good.*
import javax.inject.Inject

class GoodFragment : Fragment(), View.OnClickListener {

    @Inject lateinit var goodViewModel: GoodViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity?.applicationContext as MyApplication).applicationComponent.inject(this)
    }

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