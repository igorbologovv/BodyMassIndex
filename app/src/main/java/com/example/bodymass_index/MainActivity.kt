package com.example.bodymass_index

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bodymass_index.ui.theme.Bodymass_indexTheme


// i see the view model is like proc-macro in rust or  a decorator in python. easy peasy
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Bodymass_indexTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val bmiViewModel: BmiViewModel = viewModel()
                    BmiScreen(bmiViewModel, Modifier.padding(innerPadding))
                }
            }
        }
    }
}
