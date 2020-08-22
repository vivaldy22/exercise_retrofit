package com.example.exercise_retrofit.domains.good.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.exercise_retrofit.R
import com.example.exercise_retrofit.domains.good.Good
import com.example.exercise_retrofit.domains.good.GoodViewModel
import kotlinx.android.synthetic.main.fragment_good_add.*

class GoodAddFragment : Fragment() {

    private val goodViewModel by activityViewModels<GoodViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_good_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        submitGoodButton.setOnClickListener {
            val newGood = Good(name = goodNameInputText.text.toString(), type = typeIDInputText.text.toString())
            goodViewModel.createGood(newGood)
            Navigation.findNavController(view).navigate(R.id.action_goodAddFragment_pop)
        }
    }

}