package com.example.jurneyandroiddevelopment.RecycleView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jurneyandroiddevelopment.R
import com.example.jurneyandroiddevelopment.databinding.ActivityRecycleBinding

class RecycleActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRecycleBinding
    val list:List<RecycleModel> = listOf(
        RecycleModel(
            id = 1,
            title = "KTP",
            desc = "Proses Kyc Anda Dengan KTP Bung"
        ),
        RecycleModel(
            id = 2,
            title = "ATM",
            desc = "Proses Kyc Anda Dengan ATM Bung"
        ),
        RecycleModel(
            id = 1,
            title = "KK",
            desc = "Proses Kyc Anda Dengan KK Bung"
        ),
        )

    private val adapter: RecycleAdapter by lazy { RecycleAdapter(list) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvList.adapter = adapter


    }
}