package com.example.namegenerator.domain.models

class Names : ArrayList<NamesList>()

fun Names.asDomainModel() : List<NameInfo> {
    return map {
        NameInfo(it[0].toInt(), it[1], it[2], it[3], it[4].toInt(), it[5].toInt())
    }
}