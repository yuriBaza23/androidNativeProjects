package com.baza.sortapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun sortedNumber(): Int {
        // (0..10) = (0 until 10) -> 10 included
        return (0 until 10).random()
    }

    fun sort(view: View) {
        val aux = "Número sorteado:"
        val text: TextView  = findViewById(R.id.selectionText)
        text.text = aux.plus(" ").plus(sortedNumber())
    }
}