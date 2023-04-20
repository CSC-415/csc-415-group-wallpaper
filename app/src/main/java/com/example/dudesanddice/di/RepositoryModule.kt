package com.example.dudesanddice.di

import com.example.dudesanddice.data.repository.ClassesRepository
import com.example.dudesanddice.data.repository.ClassesRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton

    abstract fun bindClassesRepository(
        repository: ClassesRepositoryImpl,
    ): ClassesRepository
}