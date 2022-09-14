package com.haydar.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.haydar.databindingexample.databinding.ActivityFourthBinding
import com.haydar.databindingexample.viewmodel.FourthViewModelFactory
import com.haydar.databindingexample.viewmodel.FourthViewModel

class FourthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourthBinding
    private lateinit var fourthViewModel: FourthViewModel
    private lateinit var fourthViewModelFactory: FourthViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fourth)

        fourthViewModelFactory = FourthViewModelFactory(12)

        fourthViewModel = ViewModelProvider(this,fourthViewModelFactory)[FourthViewModel::class.java]

        binding.fourthViewModel = fourthViewModel
        binding.lifecycleOwner = this

    }
}