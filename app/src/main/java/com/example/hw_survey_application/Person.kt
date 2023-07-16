package com.example.hw_survey_application

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Person(
    val nameSurname: String,
    val email: String,
    val university: String

) : Parcelable
