package com.ds.words

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        //Pegar a intent que iniciou essa activity e extrair a string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        //Captura o textView do layout e seta a string acima como seu texto
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}