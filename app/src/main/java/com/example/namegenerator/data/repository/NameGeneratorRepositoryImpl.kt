package com.example.namegenerator.data.repository

import com.example.namegenerator.domain.models.NameInfo
import com.example.namegenerator.domain.repository.NameGeneratorRepository
import com.example.namegenerator.domain.source.NameGeneratorRemoteSource
import com.example.namegenerator.util.Ethnicity
import com.example.namegenerator.util.Gender
import java.util.*
import javax.inject.Inject

class NameGeneratorRepositoryImpl @Inject constructor(
    private val nameGeneratorRemoteSource: NameGeneratorRemoteSource
): NameGeneratorRepository {

    override suspend fun fetchNames() {
        nameGeneratorRemoteSource.fetchNames()
    }

    override fun getNameInfo(gender: Gender): NameInfo? {
        val names = nameGeneratorRemoteSource.getNames()
        val years  = names.map {
            it.birthYear
        }
        Collections.sort(years)
        val year = Random().nextInt(years[years.size-1] - years[0] + 1) + years[0]
        val type = Random().nextInt(Ethnicity.values().size) + 1
        val ethnicity = Ethnicity.from(type)
        val info = names.find {
            it.gender == gender.type && it.birthYear == year && it.ethnicity == ethnicity.type && it.rank == 1
        }
        return info
    }
}