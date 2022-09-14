package com.haydar.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.haydar.databindingexample.databinding.ActivitySecondBinding
import com.haydar.databindingexample.model.Student

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_second)

        binding.student = getStudent()
    }

    private fun getStudent(): Student {
        return Student(1,"ntar dulu","haybor@gmail.com")
    }
}