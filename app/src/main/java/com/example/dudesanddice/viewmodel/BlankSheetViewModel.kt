package com.example.dudesanddice.viewmodel

import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dudesanddice.ModelPreferenceManager
import com.example.dudesanddice.model.Character
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BlankSheetViewModel @Inject constructor() : ViewModel() {

    private val _viewState = MutableStateFlow<CharacterSheetViewState>(CharacterSheetViewState.Failure)
    val viewState = _viewState.asStateFlow()

    fun getCharacterFromPreferences() =
        viewModelScope.launch {
            _viewState.value = CharacterSheetViewState.Success(ModelPreferenceManager.get(PREFERENCES_CHARACTER_KEY))
        }

    fun saveCharacterToPreferences(character: Character) {
        viewModelScope.launch {
            ModelPreferenceManager.put(character, PREFERENCES_CHARACTER_KEY)
        }
    }

//    fun onTextChanged(text: CharSequence?, start: Int, end: Int, changed: Int) {
//        // Figure out a better way to update your character or something,
//        // preferably, you would want to find a generic solution rather than
//        // making a new function for everything.
//        saveCharacterToPreferences(character)
//    }

    companion object {
        private const val PREFERENCES_CHARACTER_KEY = "user_char"
    }


//    sealed class SavedDataEvent {
//        data class Success(val myCharacter: Character) : SavedDataEvent()
//        object Failure : SavedDataEvent()
//        object Loading : SavedDataEvent()
//    }
}

sealed class CharacterSheetViewState {
    data class Success(val character: Character):  CharacterSheetViewState()
    object Failure : CharacterSheetViewState()
}

