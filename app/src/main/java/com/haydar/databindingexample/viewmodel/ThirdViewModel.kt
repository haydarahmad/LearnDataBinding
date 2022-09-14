package com.haydar.databindingexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ThirdViewModel: ViewModel() {
    val name = MutableLiveData<String>()

    init {
        name.value = "kuy"
    }
}