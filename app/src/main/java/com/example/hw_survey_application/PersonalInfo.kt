package com.example.hw_survey_application

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class PersonalInfo(
    val nameSurname: String,
    val gradutation: String,
    val department: String,
    val hobbies: String

) : Parcelable
