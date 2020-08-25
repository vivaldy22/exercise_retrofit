package com.example.exercise_retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appContainer = (application as MyApplication).appContainer

        navController = (nav_main_host_fragment_container as NavHostFragment).navController
        NavigationUI.setupWithNavController(bottom_navigation, navController)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.showGood -> {
                    navController.navigate(R.id.action_to_goodFragment)
                    true
                }

                R.id.createGood -> {
                    navController.navigate(R.id.action_to_goodAddFragment)
                    true
                }
                else -> {
                    println("MASUK ELSE")
                    false
                }
            }
        }
    }


}