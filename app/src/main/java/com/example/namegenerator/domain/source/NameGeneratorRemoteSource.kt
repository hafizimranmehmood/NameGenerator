package com.example.namegenerator.domain.source

import com.example.namegenerator.domain.models.NameInfo

interface NameGeneratorRemoteSource {

    suspend fun fetchNames(): List<NameInfo>
    fun getNames(): List<NameInfo>
}