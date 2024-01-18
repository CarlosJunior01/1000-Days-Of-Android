package com.carlosjr.days_of_android.year_2024.january.week_02.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.carlosjr.days_of_android.R
import com.carlosjr.days_of_android.databinding.FragmentMenuBinding

class MenuFragment : Fragment(R.layout.fragment_menu) {

    private lateinit var binding: FragmentMenuBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMenuBinding.bind(view)
        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        postsButton.setOnClickListener {  }
    }

}