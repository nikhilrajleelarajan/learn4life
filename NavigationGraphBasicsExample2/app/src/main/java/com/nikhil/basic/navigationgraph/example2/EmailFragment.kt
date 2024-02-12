package com.nikhil.basic.navigationgraph.example2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.nikhil.basic.navigationgraph.example2.databinding.FragmentEmailBinding

class EmailFragment : Fragment() {
    private lateinit var binding: FragmentEmailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_email, container, false)
        binding.nextButton.setOnClickListener {
            if(!binding.emailEditText.text.isNullOrBlank()){
                arguments?.putString("email",binding.emailEditText.text.toString())
                it.findNavController().navigate(R.id.action_emailFragment_to_finalFragment,arguments)
            }
        }
        return binding.root
    }

}