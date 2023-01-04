package com.baza.thenews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextNews(view: View) {
        val news: TextView = findViewById(R.id.txtTitle)
        val nextBtn: Button = findViewById(R.id.btnNext)
        val prevBtn: Button = findViewById(R.id.btnPrev)
        val date: TextView = findViewById(R.id.txtDate)
        val desc: TextView = findViewById(R.id.txtDescription)
        val img: ImageView = findViewById(R.id.bgImage)

        when(news.text) {
            getString(R.string.news_title) -> {
                img.setImageDrawable(getDrawable(R.drawable.argentina))
                img.contentDescription = getString(R.string.image_description1)
                news.text = getString(R.string.news_title1)
                date.text = getString(R.string.news_date1)
                desc.text = getString(R.string.news_description1)
            }
            getString(R.string.news_title1) -> {
                img.setImageDrawable(getDrawable(R.drawable.work))
                img.contentDescription = getString(R.string.image_description2)
                news.text = getString(R.string.news_title2)
                date.text = getString(R.string.news_date2)
                desc.text = getString(R.string.news_description2)
            }
        }

        if(news.text == getString(R.string.news_title2))
            nextBtn.isEnabled = false

        if(news.text != getString(R.string.news_title))
            prevBtn.isEnabled = true
    }

    fun prevNews(view: View) {
        val news: TextView = findViewById(R.id.txtTitle)
        val nextBtn: Button = findViewById(R.id.btnNext)
        val prevBtn: Button = findViewById(R.id.btnPrev)
        val date: TextView = findViewById(R.id.txtDate)
        val desc: TextView = findViewById(R.id.txtDescription)
        val img: ImageView = findViewById(R.id.bgImage)

        when(news.text) {
            getString(R.string.news_title2) -> {
                img.setImageDrawable(getDrawable(R.drawable.argentina))
                img.contentDescription = getString(R.string.image_description1)
                news.text = getString(R.string.news_title1)
                date.text = getString(R.string.news_date1)
                desc.text = getString(R.string.news_description1)
            }
            getString(R.string.news_title1) -> {
                img.setImageDrawable(getDrawable(R.drawable.image))
                img.contentDescription = getString(R.string.image_description)
                news.text = getString(R.string.news_title)
                date.text = getString(R.string.news_date)
                desc.text = getString(R.string.news_description)
            }
        }

        if(news.text == getString(R.string.news_title))
            prevBtn.isEnabled = false

        if(news.text != getString(R.string.news_title2))
            nextBtn.isEnabled = true
    }
}