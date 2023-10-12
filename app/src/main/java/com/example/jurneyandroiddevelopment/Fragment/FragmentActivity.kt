package com.example.jurneyandroiddevelopment.Fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jurneyandroiddevelopment.R
import com.example.jurneyandroiddevelopment.databinding.ActivityFragmentBinding
import com.google.android.material.tabs.TabLayoutMediator

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFragmentBinding
    private val listFragment = listOf(
        "Anjing Fragment" to AnjingFragment(),
        "Kucing Fragment" to KucingFragment()
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViePagerAdapter(listFragment.map { it.second }, supportFragmentManager, lifecycle)
        binding.vpContent.adapter = adapter

        // Perbaikan: Memanggil attach() untuk TabLayoutMediator
        TabLayoutMediator(binding.tlMenu, binding.vpContent) { tab, position ->
            tab.text = listFragment[position].first
        }.attach() // Memanggil attach() untuk menghubungkan TabLayout dengan ViewPager
    }
}
