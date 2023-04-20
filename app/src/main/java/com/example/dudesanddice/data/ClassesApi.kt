package com.example.dudesanddice.data

import com.example.dudesanddice.model.ClassesResponse
import retrofit2.Response
import retrofit2.http.GET

interface ClassesApi {
    @GET("/api/classes")
    suspend fun getClasses(): Response<ClassesResponse>
}
