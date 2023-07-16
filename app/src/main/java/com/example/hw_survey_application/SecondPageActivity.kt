package com.example.hw_survey_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hw_survey_application.databinding.ActivityMainBinding
import com.example.hw_survey_application.databinding.ActivitySecondBinding

class SecondPageActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding=ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val nameSurname = intent.getStringExtra("namesurname")

        with(binding) {

            tvNamesurname.text = nameSurname.toString()

            saveBtn.setOnClickListener {
                if (!etUniversity.text.isNullOrEmpty() && !etMail.text.isNullOrEmpty()) {
                    val user = Person(
                        nameSurname.toString(),
                        etMail.text.toString(),
                        etUniversity.text.toString(),
                    )
                    val intent = Intent(this@SecondPageActivity, ThirdPageActivity::class.java)
                    intent.putExtra("user", user)
                    startActivity(intent)
                }
                }
            }
        }

    }