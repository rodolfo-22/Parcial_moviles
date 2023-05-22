package com.example.hoteltracker_test.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation



import com.example.hoteltracker_test.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [BillBoardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BillBoardFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
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
        binding.setOnClickLi
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