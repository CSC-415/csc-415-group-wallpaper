package com.example.dudesanddice

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.GsonBuilder
import android.util.Log
import com.example.dudesanddice.ui.BlankSheetFragment

object ModelPreferenceManager {
    lateinit var preferences: SharedPreferences

    private const val PREFERENCES_FILE_NAME = "USER_CHARACTER_STORAGE"

    fun with(application: MainActivity) {
        preferences = application.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE)
    }

    fun <Character> put(T: Character, key: String) {
        val jsonString = GsonBuilder().create().toJson(T)
        Log.d("ModelPreferenceManager", "Saving object with key $key: $jsonString")
        preferences.edit().putString(key, jsonString).apply()
    }

    //changing
    inline fun <reified Character> get(key: String): Character {
        val value = preferences.getString(key, null)
        Log.d("ModelPreferenceManager", "Retrieving object with key $key: $value")
        return GsonBuilder().create().fromJson(value, Character::class.java)
    }
}