package com.haydar.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.haydar.databindingexample.databinding.ActivityThirdBinding
import com.haydar.databindingexample.viewmodel.ThirdViewModel

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding
    private lateinit var thirdViewModel: ThirdViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_third)

        thirdViewModel = ViewModelProvider(this)[ThirdViewModel::class.java]

        binding.myViewModel = thirdViewModel
        binding.lifecycleOwner = this
    }
}