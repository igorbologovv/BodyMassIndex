package com.example.bodymass_index


import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class BmiViewModel : ViewModel() {

    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")


    val bmi: String
        get() {
            val height = heightInput.toFloatOrNull() ?: 0.0f
            val weight = weightInput.toFloatOrNull() ?: 0.0f
            return if (weight > 0 && height > 0) {
                String.format("%.2f", weight / (height * height))
            } else {
                "0.0"
            }
        }
}
