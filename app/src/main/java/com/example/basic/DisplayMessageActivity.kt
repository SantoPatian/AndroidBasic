package com.example.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.basic.databinding.ActivityDisplayMessageBinding

class DisplayMessageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDisplayMessageBinding
    private lateinit var textView: TextView
    private lateinit var message: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        message = intent.getStringExtra(EXTRA_MESSAGE).toString()

        textView = binding.contentTextView
        textView.apply {
            text = message
        }
    }
}