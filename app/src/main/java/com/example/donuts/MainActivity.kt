package com.example.donuts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.donuts.ui.navigation.DonutsApp
import com.example.donuts.ui.theme.DonutsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DonutsTheme {
                DonutsApp()
            }
        }
    }
}

