package com.carlosjr.days_of_android.extensions

import android.os.Bundle
import android.widget.Toast
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

fun Fragment.navTo(@IdRes destiny: Int) = findNavController().navigate(destiny)
fun Fragment.navTo(@IdRes destiny: Int, args: Bundle) = findNavController().navigate(destiny, args)
fun Fragment.toast(message: String) = Toast.makeText (requireContext(), message, Toast.LENGTH_SHORT).show()
