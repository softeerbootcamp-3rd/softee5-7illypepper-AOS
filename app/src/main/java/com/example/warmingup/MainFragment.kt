package com.example.warmingup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.warmingup.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainBinding.inflate(layoutInflater)
        val navHostFragment = requireActivity().supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        binding.nextMain.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_selectFragment1)
        }
    }
}