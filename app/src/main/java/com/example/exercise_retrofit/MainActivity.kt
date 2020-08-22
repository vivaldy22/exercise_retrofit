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

//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.nav_main_host_fragment_container) as NavHostFragment
//        navController = navHostFragment.navController

        navController = (nav_main_host_fragment_container as NavHostFragment).navController
        NavigationUI.setupWithNavController(bottom_navigation, navController)


//        val appBarConfiguration =
//            AppBarConfiguration(setOf(R.id.goodFragment, R.id.goodAddFragment))
//        setupActionBarWithNavController(navHostFragment.navController, appBarConfiguration)

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