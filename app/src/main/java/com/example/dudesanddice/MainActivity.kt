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

    }

}