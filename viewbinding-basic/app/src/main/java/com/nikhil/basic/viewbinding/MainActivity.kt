package com.nikhil.basic.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.nikhil.basic.viewbinding.databinding.ActivityMainBinding
import com.nikhil.basic.viewbinding.models.Student

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.student = getStudentDetails()
        binding.button.setOnClickListener { setListener() }
    }

    private fun setListener(){
        if (binding.progressBar.visibility == View.VISIBLE){
            binding.progressBar.visibility = View.GONE
            binding.nameText.text = "Hidden"
            binding.button.text = "SHOW Progress"
        }else{
            binding.progressBar.visibility = View.VISIBLE
            binding.nameText.text = "VISIBLE"
            binding.button.text = "HIDE Progress"
        }
    }

    private fun getStudentDetails(): Student {
        return Student(studentName = "Nikhil", studentEmail = "nikhil@learforlife.com")
    }
}