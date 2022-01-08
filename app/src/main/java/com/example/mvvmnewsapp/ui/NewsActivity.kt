package com.example.mvvmnewsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mvvmnewsapp.R
import com.example.mvvmnewsapp.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {
    private var binding: ActivityNewsBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        var newsNavHostFragment: Fragment = supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as Fragment

        binding?.bottomNavigationView?.setupWithNavController(newsNavHostFragment.findNavController())
    }
}