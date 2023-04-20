package com.example.dudesanddice.model
import com.squareup.moshi.Json

data class Classes(
    @Json(name = "index")
    val index: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "url")
    val url: String
)