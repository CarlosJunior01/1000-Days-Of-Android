package com.carlosjr.days_of_android.year_2024.january.week_03.presentation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
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
            toast(inputEditText.text.toString())
            editText.text = null
        }
        switchComponent.setOnClickListener {
            if (switchComponent.isChecked) toast("switch.isChecked") else toast("switch.notChecked")
        }

        alertDialogAButton.setOnClickListener { setupAlertDialogA() }
        alertDialogBButton.setOnClickListener { setupAlertDialogB() }
    }

    private fun setupViews() = with(binding) {
        textViewResult.text = ""
    }

    private fun setupAlertDialogA() {
        val alertBuilder = AlertDialog.Builder(requireContext())
        alertBuilder.setTitle("Alert Dialog A")
        alertBuilder.setMessage("Deseja confirmar a ação?")
        alertBuilder.setIcon(R.drawable.ic_close_24)
        alertBuilder.setPositiveButton("Confirmar") { _, _ -> toast("Confirmar Selecionado") }
        alertBuilder.setNegativeButton("Cancelar") { _, _ -> toast("Cancelar Selecionado") }
        alertBuilder.setNeutralButton("Fechar") { dialog, _ -> dialog.dismiss() }
        alertBuilder.setCancelable(false)

        val alertDialog = alertBuilder.create()
        alertDialog.show()
    }

    private fun setupAlertDialogB() {
        AlertDialog.Builder(requireContext())
            .setTitle("Alert Dialog B")
            .setMessage("Deseja confirmar a ação?")
            .setPositiveButton("Confirmar") { _, _ -> toast("Confirmar Selecionado") }
            .setNegativeButton("Cancelar") { _, _ -> toast("Cancelar Selecionado") }
            .setNeutralButton("Fechar") { dialog, _ -> dialog.dismiss() }
            .create().show()
    }
}