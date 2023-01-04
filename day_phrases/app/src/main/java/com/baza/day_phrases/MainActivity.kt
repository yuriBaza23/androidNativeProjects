package com.baza.day_phrases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.phrase)
        val toSetToPhrase = "Pressione o botão para uma frase motivacional \uD83D\uDC4A"
        text.text = toSetToPhrase
    }

    private fun generateRandomInt(): Int {
        return (0..3).random()
    }

    fun generatePhrase(view: View) {
        val phrases = arrayOf(
            "Pense diferente.",
            "Esteja tão ocupado melhorando você mesmo, que não terá tempo para criticar os outros.",
            "Pare de sonhar, comece a viver.",
            "Comece onde você está, use o que você tem, faça o que você pode.",
        )
        val phrase: TextView = findViewById(R.id.phrase)
        val int: Int = generateRandomInt();
        phrase.text = phrases[int]
    }
}