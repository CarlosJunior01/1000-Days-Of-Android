package com.carlosjr.days_of_android.year_2024.january.week_03.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.carlosjr.days_of_android.R
import com.carlosjr.days_of_android.databinding.FragmentInterfaceComponentsTwoBinding
import com.carlosjr.days_of_android.extensions.toast

class InterfaceComponentsTwoFragment : Fragment(R.layout.fragment_interface_components_two) {

    private lateinit var binding: FragmentInterfaceComponentsTwoBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInterfaceComponentsTwoBinding.bind(view)
        setupViews()
        setupListeners()
    }

    private fun setupListeners() = with(binding) {
       confirmButton.setOnClickListener {
           textViewResult.text = editText.text.toString()
           toast(editText.text.toString())
           editText.text = null
       }
        switch.setOnClickListener {
            if (switch.isChecked) toast("switch.isChecked") else toast("switch.notChecked")
        }
    }

    private fun setupViews() = with(binding) {
        textViewResult.text = ""
    }
}