package com.nikhil.basic.navigationgraph.example2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.nikhil.basic.navigationgraph.example2.databinding.FragmentNameBinding


class NameFragment : Fragment() {

    private lateinit var binding: FragmentNameBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding  = DataBindingUtil.inflate(inflater,R.layout.fragment_name, container, false)
        binding.nextButton.setOnClickListener {
            if(!binding.nameEditText.text.isNullOrBlank()){
                val bundle : Bundle = bundleOf("name" to binding.nameEditText.text.toString())
                it.findNavController().navigate(R.id.action_nameFragment_to_emailFragment,bundle)
            }
        }
        return binding.root
    }
}