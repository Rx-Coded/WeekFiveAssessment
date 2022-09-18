package com.example.weekfiveassessment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.weekfiveassessment.fragments.FirstFragment
import com.example.weekfiveassessment.fragments.SecondFragment

//This Adapter is responsible for syncing the TabLayout and the ViewPager so that when  an option on the TabLayout is selected it can show the appropriate fragment that matches the TabLayout option.

class MainPagerAdapter (fragM:FragmentManager,lifeC:Lifecycle) :FragmentStateAdapter(fragM,lifeC){

    //This returns the number of data passed to the adapter
    override fun getItemCount(): Int {
        return 2
    }

    //This provides the current position of the user on the TabLayout  then it returns the appropriate fragment.
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0-> FirstFragment()

            else-> SecondFragment()
        }

    }
}