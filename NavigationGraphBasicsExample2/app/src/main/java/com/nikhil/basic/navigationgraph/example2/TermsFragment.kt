package com.nikhil.basic.navigationgraph.example2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.nikhil.basic.navigationgraph.example2.databinding.FragmentTermsBinding

class TermsFragment : Fragment() {

    private lateinit var binding : FragmentTermsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_terms, container, false)
        return binding.root
    }


}