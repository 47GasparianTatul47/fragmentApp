package com.example.fragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.fragmentapp.databinding.FragmentScrollingNavBinding

class NavScrollingFragment : Fragment() {


    private lateinit var  sharedViewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_scrolling_nav, container, false)
        val binding = FragmentScrollingNavBinding.bind(view)

        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        sharedViewModel.nameStudent.observe(viewLifecycleOwner, { nameStudent ->
            binding.scrolingTv.text = nameStudent
        })


        binding.goBlank.setOnClickListener {
            sharedViewModel.setEditText(binding.scrolingTv.text.toString())
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_scrollingFragmentNav_to_navBlankFragment2)

        }
        return binding.root

    }


}
