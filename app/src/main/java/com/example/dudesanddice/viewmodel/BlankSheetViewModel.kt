package com.example.dudesanddice.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dudesanddice.ModelPreferenceManager
import com.example.dudesanddice.data.ClassesApi
import com.example.dudesanddice.data.model.ClassesResponse
import com.example.dudesanddice.data.repository.ClassesRepository
import com.example.dudesanddice.data.repository.ClassesRepositoryImpl
import com.example.dudesanddice.databinding.FragmentBlankSheetBinding
import com.example.dudesanddice.model.Character
import com.example.dudesanddice.model.Classes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject



@HiltViewModel
class BlankSheetViewModel @Inject constructor() : ViewModel() {

    private val _viewState =
        MutableStateFlow<CharacterSheetViewState>(CharacterSheetViewState.Failure)
    val viewState = _viewState.asStateFlow()

    fun getCharacterFromPreferences() =
        viewModelScope.launch {
            _viewState.value =
                CharacterSheetViewState.Success(ModelPreferenceManager.get(PREFERENCES_CHARACTER_KEY))
        }
    fun saveCharacterToPreferences(character: Character) {
        viewModelScope.launch {
            ModelPreferenceManager.put(character, PREFERENCES_CHARACTER_KEY)
        }
    }

    companion object {
        private const val PREFERENCES_CHARACTER_KEY = "user_char"
    }
}

sealed class CharacterSheetViewState {
    data class Success(val character: Character) : CharacterSheetViewState()
    object Failure : CharacterSheetViewState()
}

