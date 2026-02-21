package com.dhiyana.snapeats

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find NavHostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as? NavHostFragment

        navHostFragment?.let {
            // Get NavController
            val navController = it.navController

            // Set up BottomNavigationView with NavController
            val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
            NavigationUI.setupWithNavController(bottomNav, navController)
        }
    }
}