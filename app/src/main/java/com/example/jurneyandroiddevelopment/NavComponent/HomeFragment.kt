package com.example.jurneyandroiddevelopment.NavComponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.jurneyandroiddevelopment.R
import com.example.jurneyandroiddevelopment.databinding.FragmentHistoryBinding
import com.example.jurneyandroiddevelopment.databinding.FragmentHomeBinding



class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btInbox.setOnClickListener{

//         Menggunakan Bundle
            val bundle = bundleOf("someArgument" to "Ini Sudah DiGanti BosQu")
            it.findNavController().navigate(R.id.inbox , bundle)

        // Menggunakan Safe Arg
//        val action = HomeFragmentDirection.openInbox("Muh Kelvin")
//        Navigation.findNavController(it).navigate(openInbox)
        }


    }

}