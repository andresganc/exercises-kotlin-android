package com.nc.course_kotlin_android

import android.R
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.nc.course_kotlin_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowName.setOnClickListener{ checkValue() }
    }

    fun checkValue() {
        if ( binding.etName.text.isNotEmpty() ) {
            // Go to new screen
        } else {
            showErrorName()
        }
    }

    fun showErrorName() {
        Toast.makeText(this, "Add your name", Toast.LENGTH_SHORT).show()
    }
}