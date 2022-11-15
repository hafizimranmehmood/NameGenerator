package com.example.namegenerator.domain.models

data class NameInfo(
    val birthYear: Int,
    val gender: String,
    val ethnicity: String,
    val name: String,
    val nameCount: Int,
    val rank: Int
)
