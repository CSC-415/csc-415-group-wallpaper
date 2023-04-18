package com.example.dudesanddice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dudesanddice.model.Character
import androidx.fragment.app.commit
import com.example.dudesanddice.databinding.ActivityMainBinding
import com.example.dudesanddice.ui.BlankSheetFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var character = Character()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ModelPreferenceManager.with(this)

        binding = .inflate(layoutInflater)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_scroll, BlankSheetFragment(binding))
        }
        setContentView(binding.root)


        binding.saveButton.setOnClickListener {
            Log.d("MAIN", "BUTTON MAIN")

            binding.apply{
                character.apply{
                    charName = nameBox.text.toString()
                    Log.d("MAIN2", charName)
                }
            }
        }

    }
    companion object {
        private const val PREFERENCES_CHARACTER_KEY = "user_char"
    }
}