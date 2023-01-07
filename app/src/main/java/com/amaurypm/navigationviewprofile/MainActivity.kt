package com.amaurypm.navigationviewprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.core.view.GravityCompat
import com.amaurypm.navigationviewprofile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.nvMain.itemIconTintList = null

    }

    fun click(view: View) {
        when(view.id){
            R.id.ivMenu -> {
                binding.dlMain.openDrawer(GravityCompat.START)
            }
        }
    }

}