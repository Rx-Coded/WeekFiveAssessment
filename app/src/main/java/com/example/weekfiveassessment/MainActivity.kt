package com.example.weekfiveassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    // The aim of the initialization is to connect the components of layouts to the  main activity in order to manipulate them through codes.


    // This is an initialization of the ToolBar
    private lateinit var toolbar:Toolbar

    //This is an initialization of the TabLayout
    private lateinit var tabLayout: TabLayout

    //This is an initialization of the Viewpager
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        accessInitialized()
    }

    private fun accessInitialized() {  //This finds the toolBar by its Id and makes it accessible

        //This finds the toolbar by its Id and makes it accessible
        toolbar = findViewById(R.id.toolbar)


        setSupportActionBar(toolbar)

        //This finds the TabLayout by its Id and makes it accessible
        tabLayout = findViewById(R.id.tab)

        //This finds the ViewPager by its Id and makes it accessible
        viewPager = findViewById(R.id.viewPager)

        //To connect the ViewPager to the MainPageAdapter
        viewPager.adapter = MainPagerAdapter(supportFragmentManager,lifecycle)

        //To connect the TabLayout to the ViewPager inorder to update the current fragment

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->

            // When condition  is used to set the name option on the TabLayout  based on the position

            when (position) {
                0-> tab.text = "FRAG 1"
                1-> tab.text = "FRAG 2"
            }

        }.attach()

        //This sets the "Chat" as the start tab.

        viewPager.currentItem = 1

    }
}