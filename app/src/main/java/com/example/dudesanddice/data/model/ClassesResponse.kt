package com.example.dudesanddice.data.model

import com.example.dudesanddice.model.Classes


sealed class ClassesResponse {
    data class Success(val classes: List<Classes>) :
        ClassesResponse()

    object Error : ClassesResponse()
}
