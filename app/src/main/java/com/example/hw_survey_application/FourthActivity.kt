package com.example.hw_survey_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import com.example.hw_survey_application.databinding.ActivityFourthBinding

class FourthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val info = intent.getParcelableExtra("info") as Person?

        with(binding) {
            tvNamesurname.text = info?.nameSurname
            tvDepartment.text = info?.PersonalInfo?.department
            tvGradution.text = info?.PersonalInfo?.graduation
            tvMail.text = info?.email
            tvUnivesity.text = info?.university
            tvhobbies.text=info?.PersonalInfo?.hobbies

            btnHome.setOnClickListener {
                val intent = Intent(this@FourthActivity, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }
            }


        var backpressCount = 0;
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (backpressCount == 0) {
                    backpressCount++

                    Toast.makeText(
                        this@FourthActivity,
                        "Press again to go back to home page!",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    backpressCount = 0

                    val intent = Intent(this@FourthActivity, MainActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    startActivity(intent)
                }
            }
        })


    }

    }

