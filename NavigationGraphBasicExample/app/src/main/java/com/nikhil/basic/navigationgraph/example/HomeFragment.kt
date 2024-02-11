package com.nikhil.basic.navigationgraph.example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.nikhil.basic.navigationgraph.example.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)

        binding.button.setOnClickListener {
            //Not suggested to pass the bundle as part of nav - Learning purpose added below. We should use viewmodels
            if(!binding.nameEditText.text.isNullOrBlank()) {
                val bundle: Bundle = bundleOf("userName" to binding.nameEditText.text.toString())
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment,bundle)
            }else{
                Toast.makeText(activity,"Name edit text is empty", Toast.LENGTH_LONG).show()
            }
        }
        return binding.root
    }
}