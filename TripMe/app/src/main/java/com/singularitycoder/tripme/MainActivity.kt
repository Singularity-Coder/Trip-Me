package com.singularitycoder.tripme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.singularitycoder.tripme.databinding.ActivityMainBinding

// Meditations & Illusions
// Zoom in and out stuff
// Clockwise rotating
// Clockwise rotating, shrinking and vanishing at the center
// Pendulum or swaying stuff
// Mandelbrot zooms

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.setupUI()
    }

    private fun ActivityMainBinding.setupUI() {
        rvMeditations.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
//            adapter = routinesAdapter
        }
    }
}