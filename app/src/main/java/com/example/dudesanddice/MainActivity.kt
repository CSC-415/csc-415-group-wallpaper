package com.example.dudesanddice

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.dudesanddice.databinding.ActivitySheetByHandBinding
import com.example.dudesanddice.model.Character


class MainActivity : AppCompatActivity() {
    private var myCharacter = Character()

    private lateinit var binding: ActivitySheetByHandBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sheet_by_hand)
        bindInputToObject(myCharacter)
        ModelPreferenceManager.with(this)
        myCharacter = ModelPreferenceManager.get<Character>("user_char")

        binding.nameBox.setText(myCharacter.charName)
        binding.classLevel.setText(myCharacter.charClass)
        binding.background.setText(myCharacter.charBackground)
        binding.playerName.setText(myCharacter.charPlayerName)
        binding.race.setText(myCharacter.charRace)
        binding.alignment.setText(myCharacter.charAlignment)
        binding.xp.setText(myCharacter.charExperiencePoints.toString())
        binding.strBox.setText(myCharacter.charStrength.toString())
        binding.dexBox.setText(myCharacter.charDexterity.toString())
        binding.conBox.setText(myCharacter.charConstitution.toString())
        binding.intBox.setText(myCharacter.charIntelligence.toString())
        binding.wisBox.setText(myCharacter.charWisdom.toString())
        binding.chaBox.setText(myCharacter.charCharisma.toString())
        binding.armorClass.setText(myCharacter.charAC.toString())

    }


    private fun bindInputToObject(myCharacter: Character) {
        binding.nameBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                myCharacter.charName = s.toString()
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.classLevel.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                myCharacter.charClass = s.toString()
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.background.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                myCharacter.charBackground = s.toString()
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.playerName.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                myCharacter.charName = s.toString()
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.race.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                myCharacter.charRace = s.toString()
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.alignment.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                myCharacter.charAlignment = s.toString()
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.xp.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charExperiencePoints = s.toString().toInt()
                } else {
                    myCharacter.charExperiencePoints = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.strBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charStrength = s.toString().toInt()
                } else {
                    myCharacter.charStrength = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.dexBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charDexterity = s.toString().toInt()
                } else {
                    myCharacter.charDexterity = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.conBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charConstitution = s.toString().toInt()
                } else {
                    myCharacter.charConstitution = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.intBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charIntelligence = s.toString().toInt()
                } else {
                    myCharacter.charIntelligence = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.wisBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charWisdom = s.toString().toInt()
                } else {
                    myCharacter.charWisdom = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.chaBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charCharisma = s.toString().toInt()
                } else {
                    myCharacter.charCharisma = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.armorClass.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charAC = s.toString().toInt()
                } else {
                    myCharacter.charAC = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.initiative.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charInitiative = s.toString().toInt()
                } else {
                    myCharacter.charInitiative = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.speed.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charSpeed = s.toString().toInt()
                } else {
                    myCharacter.charSpeed = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.currHp.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charCurrentHP = s.toString().toInt()
                } else {
                    myCharacter.charCurrentHP = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.tempHp.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charTempHP = s.toString().toInt()
                } else {
                    myCharacter.charTempHP = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.strSave.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charStrSave = s.toString().toInt()
                } else {
                    myCharacter.charStrSave = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.intSave.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charIntSave = s.toString().toInt()
                } else {
                    myCharacter.charIntSave = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.dexSave.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charDexSave = s.toString().toInt()
                } else {
                    myCharacter.charDexSave = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.wisSave.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charWisSave = s.toString().toInt()
                } else {
                    myCharacter.charWisSave = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.conSave.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charConSave = s.toString().toInt()
                } else {
                    myCharacter.charConSave = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.chaSave.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty()) {
                    myCharacter.charChaSave = s.toString().toInt()
                } else {
                    myCharacter.charChaSave = 0
                }
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.skillsBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                myCharacter.charSkillsBox = s.toString()
                ModelPreferenceManager.put(myCharacter, "user_char")
            }

        })

        binding.attacksBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                myCharacter.charAttacksAndSpellcasting = s.toString()
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.featuresBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                myCharacter.charFeaturesAndTraits = s.toString()
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.eqBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                myCharacter.charEquipment = s.toString()
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })

        binding.otherProfBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                myCharacter.charProficienciesAndLanguages = s.toString()
                ModelPreferenceManager.put(myCharacter, "user_char")
            }
        })
    }


    override fun onDestroy() {
        super.onDestroy()
    }
}