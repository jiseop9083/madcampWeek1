package com.example.madcampweek1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import org.json.JSONObject

interface DataTransferListener {
    fun onDataTransfer(data: String)
}

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {

        return when(position) {
            0 -> Profile()
            1 -> Picture()
            else -> Calendar()

        }
    }
}