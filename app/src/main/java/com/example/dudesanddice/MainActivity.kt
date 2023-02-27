package com.example.dudesanddice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.dudesanddice.databinding.ActivitySheetByHandBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySheetByHandBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sheet_by_hand)
    }
}