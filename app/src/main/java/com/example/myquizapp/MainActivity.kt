package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btn_start)
        val nameInput: EditText = findViewById(R.id.name_input)
        btnStart.setOnClickListener{
            if (nameInput.text.isEmpty()) {
                Toast.makeText(this,
                    "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                // Para mudar de página eu preciso passar o contexto (página que eu estou)
                // E a página que eu quero ir.
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                // Para mandar informaçÕes de uma activity para outra.
                intent.putExtra(Constants.USER_NAME, nameInput.text.toString())
                startActivity(intent)
                // Para fechar a página anterior.
                finish()
            }
        }
    }
}