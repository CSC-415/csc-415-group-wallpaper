package com.example.dudesanddice.model
import androidx.lifecycle.GeneratedAdapter
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = false)
data class ClassesResponse(
    @Json(name = "count")
    val count: Int,
    @Json(name = "classes")
    val classes: List<Classes>
)