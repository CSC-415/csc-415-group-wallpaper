package com.example.dudesanddice

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.GsonBuilder

object ModelPreferenceManager {
    lateinit var preferences: SharedPreferences

    private const val PREFERENCES_FILE_NAME = "USER_CHARACTER_STORAGE"

    fun with(application: MainActivity){
        preferences = application.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE)
    }

    fun <Character> put (T : Character , key:String){
        val jsonString = GsonBuilder().create().toJson(T)
        preferences.edit().putString(key, jsonString).apply()
    }

    inline fun <reified Character> get(key: String): Character {
        val value = preferences.getString(key, null)
        return GsonBuilder().create().fromJson(value, Character::class.java)
    }
}