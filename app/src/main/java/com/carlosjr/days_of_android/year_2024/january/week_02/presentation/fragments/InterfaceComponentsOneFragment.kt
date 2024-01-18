package com.carlosjr.days_of_android.year_2024.january.week_02.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.carlosjr.days_of_android.R
import com.carlosjr.days_of_android.databinding.FragmentInterfaceComponentsOneBinding

class InterfaceComponentsOneFragment : Fragment() {

    private lateinit var binding: FragmentInterfaceComponentsOneBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInterfaceComponentsOneBinding.bind(view)
        setupViews()
    }

    private fun setupViews() = with(binding) {
        textViewComponent.text = getString(R.string.text_simple_text_view)
    }

}