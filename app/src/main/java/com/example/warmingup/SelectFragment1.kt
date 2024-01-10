package com.example.warmingup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.warmingup.databinding.FragmentMainBinding
import com.example.warmingup.databinding.FragmentSelect1Binding


class SelectFragment1 : Fragment() {
    lateinit var binding: FragmentSelect1Binding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentSelect1Binding.inflate(layoutInflater)
        val navHostFragment = requireActivity().supportFragmentManager.findFragmentById(R.id.nav_graph) as NavHostFragment
        navController = navHostFragment.navController


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select1, container, false)
    }
}