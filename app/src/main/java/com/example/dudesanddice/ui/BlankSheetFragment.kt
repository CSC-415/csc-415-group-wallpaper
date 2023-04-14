package com.example.dudesanddice.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import com.example.dudesanddice.R
import com.example.dudesanddice.databinding.FragmentBlankSheetBinding
import com.example.dudesanddice.model.Character
import com.example.dudesanddice.viewmodel.BlankSheetViewModel
import com.example.dudesanddice.viewmodel.CharacterSheetViewState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class BlankSheetFragment() : Fragment(){
    private var _binding: FragmentBlankSheetBinding? = null
    private val binding get() = _binding!!

    private val viewModel: BlankSheetViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBlankSheetBinding.inflate(inflater, container, false)
        setupObservers()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getCharacterFromPreferences()
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setupObservers() {
        lifecycleScope.launch {
            viewModel.viewState.collect {
                when (it) {
                    is CharacterSheetViewState.Failure -> Unit
                    is CharacterSheetViewState.Success -> {
                        bindSavedData(it.character)
                        bindInputToObject(it.character)
                    }
                }
            }
        }
    }

    private fun bindSavedData(character: Character) {
        binding.apply {
            nameBox.setText(character.charName)
            classLevel.setText(character.charClass)
            background.setText(character.charBackground)
            playerName.setText(character.charPlayerName)
            race.setText(character.charRace)
            alignment.setText(character.charAlignment)
            xp.setText(character.charExperiencePoints.toString())
            strBox.setText(character.charStrength.toString())
            dexBox.setText(character.charDexterity.toString())
            conBox.setText(character.charConstitution.toString())
            intBox.setText(character.charIntelligence.toString())
            wisBox.setText(character.charWisdom.toString())
            chaBox.setText(character.charCharisma.toString())
            armorClass.setText(character.charAC.toString())
        }
    }

    private fun bindInputToObject(character: Character) {
        binding.apply {
            saveButton.setOnClickListener{
                character.charName = nameBox.text.toString()

                viewModel.saveCharacterToPreferences(character)
            }
//            nameBox.doAfterTextChanged {
//
//            }

            // This is your next one
        }
    }
}