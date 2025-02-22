package com.example.bodymass_index

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BmiScreen(viewModel: BmiViewModel, modifier: Modifier = Modifier) {
    Column(modifier.padding(16.dp)) {
        Text(
            text = "BMI Calculator",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )


        OutlinedTextField(
            value = viewModel.heightInput,
            onValueChange = { viewModel.heightInput = it.replace(',', '.') },
            label = { Text("Height (m)") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )


        OutlinedTextField(
            value = viewModel.weightInput,
            onValueChange = { viewModel.weightInput = it.replace(',', '.') },
            label = { Text("Weight (kg)") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )


        Text(
            text = "BMI: ${viewModel.bmi}",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        )
    }
}


