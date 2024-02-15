package com.example.pixel

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {
    private lateinit var textview_random: TextView
    private lateinit var textview_label: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textview_random=findViewById(R.id.textView_random)
        textview_label=findViewById(R.id.textView_label)
        showRandomNumber()
    }

    companion object{
        const val TOTAL_COUNT = "total_count"
    }

    @SuppressLint("StringFormatInvalid")
    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random(0)
        var randomInt = 0
        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }
        textview_random.text = Integer.toString(randomInt)
        textview_label.text = getString(R.string.random_heading, count)
    }
}