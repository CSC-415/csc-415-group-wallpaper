package com.example.dudesanddice.data.repository

import com.example.dudesanddice.data.ClassesApi
import com.example.dudesanddice.data.model.ClassesResponse
import javax.inject.Inject

class ClassesRepositoryImpl @Inject constructor(
    private val classesApi : ClassesApi,
):ClassesRepository{
    override suspend fun getClasses(): ClassesResponse {
        val result = classesApi.getClasses()
        return if (result.isSuccessful){
            ClassesResponse.Success(result.body()?.classes ?:
            emptyList())
        }
        else{
            ClassesResponse.Error
        }
    }
}