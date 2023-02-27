package com.example.dudesanddice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.dudesanddice.databinding.ActivitySheetByHandBinding
import com.example.dudesanddice.model.Character
import android.text.Editable
import android.text.TextWatcher

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySheetByHandBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sheet_by_hand)

        val myCharacter = Character()

        binding.nameBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charName = s.toString()
            }
        })

        binding.classLevel.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charLevel = s.toString().toInt()
            }
        })

        binding.background.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charBackground = s.toString()
            }
        })

        binding.playerName.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charName = s.toString()
            }
        })

        binding.race.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charRace = s.toString()
            }
        })

        binding.alignment.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charAlignment = s.toString()
            }
        })

        binding.xp.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charExperiencePoints = s.toString().toInt()
            }
        })

        binding.strBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charStrength = s.toString().toInt()
            }
        })

        binding.dexBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charDexterity = s.toString().toInt()
            }
        })

        binding.conBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charConstitution = s.toString().toInt()
            }
        })

        binding.intBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charIntelligence = s.toString().toInt()
            }
        })

        binding.wisBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charWisdom = s.toString().toInt()
            }
        })

        binding.chaBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charCharisma = s.toString().toInt()
            }
        })

        binding.armorClass.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charAC = s.toString().toInt()
            }
        })

        binding.initiative.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charInitiative = s.toString().toInt()
            }
        })

        binding.speed.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charSpeed = s.toString().toInt()
            }
        })

        binding.currHp.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charCurrentHP = s.toString().toInt()
            }
        })

        binding.tempHp.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charTempHP = s.toString().toInt()
            }
        })

        binding.strSave.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charStrSave = s.toString().toInt()
            }
        })

        binding.intSave.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charIntSave = s.toString().toInt()
            }
        })

        binding.dexSave.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charDexSave = s.toString().toInt()
            }
        })

        binding.wisSave.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charWisSave = s.toString().toInt()
            }
        })

        binding.conSave.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charConSave = s.toString().toInt()
            }
        })

        binding.chaSave.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charChaSave = s.toString().toInt()
            }
        })

        binding.skillsBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                //myCharacter. = s.toString()
            }
        })

        binding.attacksBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charAttacksAndSpellcasting = s.toString()
            }
        })

        binding.featuresBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charFeaturesAndTraits = s.toString()
            }
        })

        binding.eqBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charEquipment = s.toString()
            }
        })

        binding.otherProfBox.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                myCharacter.charProficienciesAndLanguages = s.toString()
            }
        })
    }
}