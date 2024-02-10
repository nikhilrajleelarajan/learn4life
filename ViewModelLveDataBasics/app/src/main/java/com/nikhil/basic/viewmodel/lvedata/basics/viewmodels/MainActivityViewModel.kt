package com.nikhil.basic.viewmodel.lvedata.basics.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingCounterValue:Int): ViewModel() {

    private var counter = MutableLiveData<Int>()
    val currentCounterValue: LiveData<Int>
        get() = counter

    init {
        counter.value = startingCounterValue
    }

    fun addCounter(value:Int){
        counter.value = counter.value?.plus(value)
    }
}