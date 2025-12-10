package com.example.polskakuchniatradycyjna

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.polskakuchniatradycyjna.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.startFragment,
                R.id.menuChoiceFragment,
                R.id.summaryFragment
            )
        )

        binding.bottomNavigationView.setupWithNavController(navController)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.startFragment -> {
                    navController.popBackStack(R.id.startFragment, false)
                    true
                }
                R.id.menuChoiceFragment -> {
                    navController.navigate(R.id.menuChoiceFragment)
                    true
                }
                R.id.summaryFragment -> {
                    navController.navigate(R.id.summaryFragment)
                    true
                }
                else -> false
            }
        }
    }
    }