package com.haydar.databindingexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FourthViewModel(startNum: Int) : ViewModel() {
    private var _total = MutableLiveData<Int>()

    val total: LiveData<Int>
        get() = _total

    var inputext = MutableLiveData<String>()

    init {
        _total.value = startNum
    }

    fun setTotal(){
        val intInput : Int = inputext.value!!.toInt()
        _total.value = (_total.value)?.plus(intInput)
    }
}