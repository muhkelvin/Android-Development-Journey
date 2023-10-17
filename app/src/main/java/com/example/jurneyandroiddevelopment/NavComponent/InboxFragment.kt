package com.example.jurneyandroiddevelopment.NavComponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jurneyandroiddevelopment.R
import com.example.jurneyandroiddevelopment.databinding.FragmentHomeBinding
import com.example.jurneyandroiddevelopment.databinding.FragmentInboxBinding

class InboxFragment : Fragment() {
    private lateinit var binding: FragmentInboxBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInboxBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val receivedData = arguments?.getString("someArgument")
        if (receivedData != null) {
            binding.tvInbox.text = receivedData
        }

        //cara Nerima Data Dengan SafeArg

//        arguments?.let {
//            val safearg = InboxFragmentArgs.frombundle(it)
//            safearg.name
//        }

//        binding.tvInbox.text = safeArg.name

    }


}