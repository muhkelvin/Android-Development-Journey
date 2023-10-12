package com.example.jurneyandroiddevelopment.Fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViePagerAdapter(
    val fragmentlist: List<Fragment>,fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle)
{
    override fun getItemCount(): Int {
      return fragmentlist.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentlist[position]
    }
}