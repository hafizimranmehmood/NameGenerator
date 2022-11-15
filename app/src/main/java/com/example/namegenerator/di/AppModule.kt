package com.example.namegenerator.di

import com.example.namegenerator.data.repository.NameGeneratorRepositoryImpl
import com.example.namegenerator.data.source.NameGeneratorRemoteSourceImpl
import com.example.namegenerator.domain.repository.NameGeneratorRepository
import com.example.namegenerator.domain.source.NameGeneratorRemoteSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Singleton
    @Binds
    abstract fun bindRepository(nameGeneratorRepository: NameGeneratorRepositoryImpl): NameGeneratorRepository

    @Singleton
    @Binds
    abstract fun bindRemoteSource(nameGeneratorRemoteSource: NameGeneratorRemoteSourceImpl): NameGeneratorRemoteSource
}