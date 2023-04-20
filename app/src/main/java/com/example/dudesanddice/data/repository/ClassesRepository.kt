package com.example.dudesanddice.data.repository

import com.example.dudesanddice.data.model.ClassesResponse

interface ClassesRepository {
    suspend fun getClasses(): ClassesResponse
}