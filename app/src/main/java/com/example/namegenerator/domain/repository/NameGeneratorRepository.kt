package com.example.namegenerator.domain.repository

import com.example.namegenerator.domain.models.NameInfo
import com.example.namegenerator.util.Gender

interface NameGeneratorRepository {
    suspend fun fetchNames()
    fun getNameInfo(gender: Gender): NameInfo?
}