package com.example.hw_survey_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import com.example.hw_survey_application.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {

            loginBtn.setOnClickListener {
                val intent = Intent(this@MainActivity, SecondPageActivity::class.java)
                if (!etName.text.isNullOrEmpty()) {
                    intent.putExtra("namesurname", etName.text.toString())
                    startActivity(intent)
                } else {
                    Toast.makeText(this@MainActivity, "Lütfen Ad-Soyad bilgisini girin", Toast.LENGTH_SHORT).show()
                }

            }
        }
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                System.exit(0)
            }

        })
    }
}