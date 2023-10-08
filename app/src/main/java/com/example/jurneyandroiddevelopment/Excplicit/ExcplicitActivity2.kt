package com.example.jurneyandroiddevelopment.Excplicit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jurneyandroiddevelopment.R
import com.example.jurneyandroiddevelopment.databinding.ActivityExcplicit2Binding

class ExcplicitActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityExcplicit2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExcplicit2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val getData = intent.getStringExtra("data")
        binding.tvData.text = getData
    }
}