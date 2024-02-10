package com.nikhil.basic.viewmodel.lvedata.basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.nikhil.basic.viewmodel.lvedata.basics.databinding.ActivityMainBinding
import com.nikhil.basic.viewmodel.lvedata.basics.viewmodels.MainActivityViewModel
import com.nikhil.basic.viewmodel.lvedata.basics.viewmodels.MainActivityViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(100)
        viewModel = ViewModelProvider(this,viewModelFactory)[MainActivityViewModel::class.java]

        viewModel.currentCounterValue.observe(this, Observer {
            binding.counterTextView.text =  it.toString()
        })

        binding.addButton.setOnClickListener {
            viewModel.addCounter(10)
        }
    }
}