package com.nikhil.basic.livedata.viewmodel.dbindings.livedata.basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.nikhil.basic.livedata.viewmodel.dbindings.livedata.basics.databinding.ActivityMainBinding
import com.nikhil.basic.livedata.viewmodel.dbindings.livedata.basics.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        this.setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        binding.lifecycleOwner = this
        binding.mainViewModel = viewModel

    }
}