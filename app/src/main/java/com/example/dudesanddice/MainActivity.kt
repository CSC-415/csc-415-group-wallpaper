package com.example.dudesanddice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.add
import com.example.dudesanddice.model.Character
import androidx.fragment.app.commit
import com.example.dudesanddice.databinding.FragmentBlankSheetBinding

import com.example.dudesanddice.ui.BlankSheetFragment
import com.example.dudesanddice.viewmodel.BlankSheetViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: FragmentBlankSheetBinding
    private var character = Character()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ModelPreferenceManager.with(this)

        binding = FragmentBlankSheetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_scroll, BlankSheetFragment())
        }


        binding.saveButton.setOnClickListener {
            Log.d("C", "SAVE BUTTON CLICKED")
            binding.apply {
                Log.d("SAVE", "SAVE WAS CLICKED")
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
                    charAttacksAndSpellcasting = skillsBox.text.toString()
                    charFeaturesAndTraits = featuresBox.text.toString()
                    charEquipment = eqBox.text.toString()
                }
            }
            ModelPreferenceManager.put(character, PREFERENCES_CHARACTER_KEY)
        }
    }
    companion object {
        private const val PREFERENCES_CHARACTER_KEY = "user_char"
    }
}