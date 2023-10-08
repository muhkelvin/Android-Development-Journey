package com.example.jurneyandroiddevelopment.Excplicit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jurneyandroiddevelopment.R
import com.example.jurneyandroiddevelopment.databinding.ActivityExcplicitBinding

class ExcplicitActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExcplicitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExcplicitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<Student>("student")

        if (data != null){
            binding.tvExcplicit.text = data.name
            binding.tvExcpli2.text = data.nim
        }

        binding.btKirim.setOnClickListener {
            val editTextSend = binding.etExc.text.toString()
            val pindahHalaman = Intent(this@ExcplicitActivity,ExcplicitActivity2::class.java)
            pindahHalaman.putExtra("data",editTextSend)
            startActivity(pindahHalaman)
        }
    }

}