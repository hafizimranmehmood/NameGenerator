package com.example.namegenerator.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.namegenerator.domain.repository.NameGeneratorRepository
import com.example.namegenerator.util.Gender.FEMALE
import com.example.namegenerator.util.Gender.MALE
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NameGeneratorViewModel @Inject constructor(
    private val nameGeneratorRepository: NameGeneratorRepository
): ViewModel() {

    init {
        viewModelScope.launch {
            nameGeneratorRepository.fetchNames()
        }
    }

    fun getMaleInfo() = nameGeneratorRepository.getNameInfo(MALE)
    fun getFemaleInfo() = nameGeneratorRepository.getNameInfo(FEMALE)
}