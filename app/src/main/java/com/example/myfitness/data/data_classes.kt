package com.example.myfitness.data

import androidx.annotation.DrawableRes

data class Exercise(
    val name: String,
    @DrawableRes val image: Int,
    val type: ExerciseType,
    val motion: ExerciseMotion,
    val description: String
)


