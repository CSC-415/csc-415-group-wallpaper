package com.example.dudesanddice.di

import com.example.dudesanddice.data.ClassesApi
import com.example.dudesanddice.data.repository.ClassesRepository
import com.example.dudesanddice.data.repository.ClassesRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providesClassesApi(): ClassesApi =
        Retrofit.Builder()
            .baseUrl("https://www.dnd5eapi.co/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()
    /*
    @Provides
    fun provideClassesRepository(classesApi: ClassesApi): ClassesRepository =
        ClassesRepositoryImpl(classesApi)

     */
}