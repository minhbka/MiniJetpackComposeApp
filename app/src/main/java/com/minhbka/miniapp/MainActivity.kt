package com.minhbka.miniapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.minhbka.miniapp.theme.MiniAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiniAppTheme {
                Surface (modifier = Modifier.fillMaxSize()){
                    Text(text = "Hello Mini App")
                }
            }
        }

    }
}