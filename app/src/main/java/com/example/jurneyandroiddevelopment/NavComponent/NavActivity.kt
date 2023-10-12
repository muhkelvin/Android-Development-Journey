package com.example.jurneyandroiddevelopment.NavComponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jurneyandroiddevelopment.R
import com.example.jurneyandroiddevelopment.databinding.ActivityNavBinding

class NavActivity : AppCompatActivity() {
    private lateinit var binding:ActivityNavBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}