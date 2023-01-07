package com.amaurypm.navigationviewprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.amaurypm.navigationviewprofile.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.nvMain.itemIconTintList = null


        val navController = Navigation.findNavController(this, R.id.navHostFragment)

        NavigationUI.setupWithNavController(binding.nvMain, navController)


        navController.addOnDestinationChangedListener(NavController.OnDestinationChangedListener { controller, destination, arguments ->
            binding.tvTitle.text = destination.label
        })

    }

    fun click(view: View) {
        when(view.id){
            R.id.ivMenu -> {
                binding.dlMain.openDrawer(GravityCompat.START)
            }
        }
    }

}