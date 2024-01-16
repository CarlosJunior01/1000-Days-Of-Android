package com.carlosjr.days_of_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlosjr.days_of_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        setupListeners()
    }

    private fun setupListeners() = with(binding) {

    }
}