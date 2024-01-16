package com.carlosjr.days_of_android.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlosjr.days_of_android.databinding.ActivityMainBinding
import com.carlosjr.days_of_android.extensions.openActivity
import com.carlosjr.days_of_android.year_2024.january.week_01.presentation.activities.MenuActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        delayActivity()
    }

    private fun delayActivity() {
        CoroutineScope(Dispatchers.IO).launch {
            delay(THREE_SECONDS)
            withContext(Dispatchers.Main) {
                openActivity(MenuActivity())
            }
        }
    }

    companion object {
        private const val THREE_SECONDS = 3000L
    }
}