package com.carlosjr.days_of_android.year_2024.january.week_02.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.carlosjr.days_of_android.R
import com.carlosjr.days_of_android.databinding.FragmentInterfaceComponentsOneBinding
import com.carlosjr.days_of_android.extensions.toast

class InterfaceComponentsOneFragment : Fragment(R.layout.fragment_interface_components_one) {

    private lateinit var binding: FragmentInterfaceComponentsOneBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInterfaceComponentsOneBinding.bind(view)
        setupViews()
        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        toastButton.setOnClickListener {
            toast(getString(R.string.text_toast_button))
        }
    }

    private fun setupViews() = with(binding) {
        textViewComponent.text = getString(R.string.text_simple_text_view)
    }

}