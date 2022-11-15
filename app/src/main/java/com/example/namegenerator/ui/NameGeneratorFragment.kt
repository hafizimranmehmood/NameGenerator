package com.example.namegenerator.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.namegenerator.databinding.NameGeneratorFragmentBinding
import com.example.namegenerator.domain.models.NameInfo
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NameGeneratorFragment: Fragment() {

    private val viewModel by viewModels<NameGeneratorViewModel>()
    private lateinit var binding: NameGeneratorFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = NameGeneratorFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnMale.setOnClickListener {
            updateInfo(viewModel.getMaleInfo())
        }

        binding.btnFemale.setOnClickListener {
            updateInfo(viewModel.getFemaleInfo())
        }
    }

    private fun updateInfo(info: NameInfo?){
        info?.let {
            binding.nameCard.visibility = View.VISIBLE
            binding.name.text = it.name
            binding.count.text = it.nameCount.toString()
            binding.ethnicity.text = it.ethnicity
        }
    }
}