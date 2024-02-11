package com.nikhil.basic.livedata.viewmodel.dbindings.livedata.basics.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    private var counter = MutableLiveData<Int>()

    val currentCounter : LiveData<Int>
        get() = counter

    init {
        counter.value = 200
    }

    fun addCounter(){
        counter.value = counter.value?.plus(50)
    }
}