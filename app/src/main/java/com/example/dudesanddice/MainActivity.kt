package com.example.dudesanddice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import com.example.dudesanddice.model.Character
import androidx.fragment.app.commit
import com.example.dudesanddice.databinding.FragmentBlankSheetBinding

import com.example.dudesanddice.ui.BlankSheetFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: FragmentBlankSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ModelPreferenceManager.with(this)

        binding = FragmentBlankSheetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<BlankSheetFragment>(R.id.fragment_container_view)
        }
    }
}