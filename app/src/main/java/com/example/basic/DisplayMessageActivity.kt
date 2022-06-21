package com.example.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.basic.databinding.ActivityDisplayMessageBinding

class DisplayMessageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDisplayMessageBinding
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        textView = binding.textView3
        textView.apply {
            text = message
        }
    }
}