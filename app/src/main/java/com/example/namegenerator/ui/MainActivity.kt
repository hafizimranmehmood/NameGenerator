package com.example.namegenerator.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.namegenerator.R.layout
import com.example.namegenerator.databinding.ActivityMainBinding
import com.example.namegenerator.domain.models.Names
import com.example.namegenerator.domain.models.asDomainModel
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import java.util.Collections
import java.util.Random

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val list = listOf(3,4,5,2,1,1,2)
        val set = list.toSet()
        Collections.sort(set.toList())
        set.forEach {
            android.util.Log.i("tah", "${it}--message --------------->>${Random().nextInt(10-1+1)+1}")
        }
    }
}