package com.khush.moviesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.khush.moviesapp.common.UIState
import com.khush.moviesapp.databinding.ActivityMainBinding
import com.khush.moviesapp.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val items = listOf(
            ObjetoCreado("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Iberdrola_Tower_2019.jpg/330px-Iberdrola_Tower_2019.jpg", "Texto 1 - La giralda", "Texto 1 - Página 1"),
            ObjetoCreado("https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/La_Giralda_August_2012_Seville_Spain.jpg/250px-La_Giralda_August_2012_Seville_Spain.jpg", "Texto 2 - Venus", "Texto 2 - Página 2"),
            ObjetoCreado("https://example.com/image3.jpg", "Texto 3 - Marte", "Texto 3 - Página 3")
        )

        val adapter = ViewPagerAdapter(items)
        binding.viewPager.adapter = adapter
    }



}