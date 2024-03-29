package com.example.dudesanddice.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import com.example.dudesanddice.databinding.FragmentBlankSheetBinding
import com.example.dudesanddice.model.Character
import com.example.dudesanddice.viewmodel.BlankSheetViewModel
import com.example.dudesanddice.viewmodel.CharacterSheetViewState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class BlankSheetFragment : Fragment() {
    private var _binding: FragmentBlankSheetBinding? = null
    private val binding get() = _binding!!

    private val viewModel: BlankSheetViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBlankSheetBinding.inflate(inflater, container, false)
        return binding.root
    }


    //add api here
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupObservers()
        viewModel.getCharacterFromPreferences()

    }


    private fun setupObservers() {
        lifecycleScope.launch {
            viewModel.viewState.collect {
                when (it) {
                    is CharacterSheetViewState.Failure -> Unit
                    is CharacterSheetViewState.Success -> {
                        bindSavedData(it.character)
                        bindInputToObject(it.character)
                        bindClearButton()
                    }
                }
            }
        }
    }
    //private fun to be called and return class list from api

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
            initiative.setText(character.charInitiative.toString())
            speed.setText(character.charSpeed.toString())
            currHp.setText(character.charCurrentHP.toString())
            tempHp.setText(character.charCurrentHP.toString())
            strSave.setText(character.charStrSave.toString())
            dexSave.setText(character.charDexSave.toString())
            conSave.setText(character.charConSave.toString())
            intSave.setText(character.charIntSave.toString())
            wisSave.setText(character.charWisSave.toString())
            chaSave.setText(character.charChaSave.toString())
            skillsBox.setText(character.charSkillsBox)
            attacksBox.setText(character.charAttacksAndSpellcasting)
            featuresBox.setText(character.charFeaturesAndTraits)
            eqBox.setText(character.charEquipment)
            otherProfBox.setText(character.charProficienciesAndLanguages)
        }
    }

    private fun bindInputToObject(character: Character) {
        binding.saveButton.setOnClickListener {
            binding.apply {
                Log.d("SAVE", "SAVE WAS REALLY CLICKED")
                character.apply {
                    charName = nameBox.text.toString()
                    charClass = classLevel.text.toString()
                    charBackground = background.text.toString()
                    charPlayerName = playerName.text.toString()
                    charRace = race.text.toString()
                    charAlignment = alignment.text.toString()
                    charExperiencePoints = xp.text.toString().toInt()
                    charStrength = strBox.text.toString().toInt()
                    charDexterity = dexBox.text.toString().toInt()
                    charConstitution = conBox.text.toString().toInt()
                    charWisdom = wisBox.text.toString().toInt()
                    charIntelligence = intBox.text.toString().toInt()
                    charCharisma = chaBox.text.toString().toInt()
                    charAC = armorClass.text.toString().toInt()
                    charInitiative = initiative.text.toString().toInt()
                    charSpeed = speed.text.toString().toInt()
                    charCurrentHP = currHp.text.toString().toInt()
                    charTempHP = tempHp.text.toString().toInt()
                    charStrSave = strSave.text.toString().toInt()
                    charDexSave = dexSave.text.toString().toInt()
                    charConSave = conSave.text.toString().toInt()
                    charIntSave = intSave.text.toString().toInt()
                    charWisSave = wisSave.text.toString().toInt()
                    charChaSave = chaSave.text.toString().toInt()
                    charSkillsBox = skillsBox.text.toString()
                    charAttacksAndSpellcasting = attacksBox.text.toString()
                    charFeaturesAndTraits = featuresBox.text.toString()
                    charEquipment = eqBox.text.toString()
                    charProficienciesAndLanguages = otherProfBox.text.toString()
                    viewModel.saveCharacterToPreferences(character)
                }
            }
        }
    }

    private fun bindClearButton() {
        binding.apply {
            clearButton.setOnClickListener {
                val character = Character()
                bindSavedData(character)
            }
        }
    }
}