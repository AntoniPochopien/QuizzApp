package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var username = intent.getStringExtra(Constants.USER_NAME)
        var correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        var totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)

        val tvName: TextView = findViewById(R.id.tv_username)
        val tvResult: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        tvName.text = username
        tvResult.text = "Your Score is $correctAnswers out of $totalQuestions"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}