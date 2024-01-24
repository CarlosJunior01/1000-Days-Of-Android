package com.carlosjr.days_of_android.year_2024.january.week_03.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.carlosjr.days_of_android.R
import com.carlosjr.days_of_android.databinding.FragmentInterfaceComponentsTwoBinding

class InterfaceComponentsTwoFragment : Fragment(R.layout.fragment_interface_components_two) {

    private lateinit var binding: FragmentInterfaceComponentsTwoBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInterfaceComponentsTwoBinding.bind(view)
        setupViews()
        setupListeners()
    }

    private fun setupListeners() = with(binding) {
       confirmButton.setOnClickListener {  }
    }

    private fun setupViews() = with(binding) {
        textViewResult.text = ""
    }
}