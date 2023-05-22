package com.example.hoteltracker_test.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.hoteltracker_test.R
import com.example.hoteltracker_test.databinding.FragmentBillBoardBinding




class BillBoardFragment : Fragment() {

    private lateinit var binding : FragmentBillBoardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBillBoardBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                onBackPressed()
            }
        })
        listener()
    }
    private fun listener(){
        binding.btnToForm.setOnClickListener{
            it.findNavController().navigate(R.id.action_billBoardFragment_to_formFragment)
        }
    }


    //para retroceder
    private fun onBackPressed(){
        val navController = Navigation.findNavController(requireView())
        val toast = Toast.makeText(requireContext(), "works", Toast.LENGTH_SHORT)
        toast.show()
        if(navController.currentDestination?.id != R.id.billBoardFragment){
            navController.popBackStack()
        }
        else requireActivity().onBackPressed()
    }
}