package com.example.hw_survey_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hw_survey_application.databinding.ActivityThirdBinding

class ThirdPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getParcelableExtra("user") as Person?

        with(binding) {
            tvNamesurname.text = user?.nameSurname

            saveBtn.setOnClickListener {
                if (!etDepartment.text.isNullOrEmpty() && !etGraduation.text.isNullOrEmpty() && !etHobbies.text.isNullOrEmpty()) {
                    val userInfo =
                        user?.let {
                            PersonalInfo(
                                etDepartment.text.toString(),
                                etGraduation.text.toString(),
                                etHobbies.text.toString()
                            )
                        }

                    val intent = Intent(this@ThirdPageActivity, FourthActivity::class.java)
                    intent.putExtra("info", userInfo)
                    startActivity(intent)
                }
            }


        }

    }

}