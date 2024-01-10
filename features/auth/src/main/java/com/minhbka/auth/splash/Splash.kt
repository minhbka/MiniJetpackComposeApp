package com.minhbka.auth.splash

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.minhbka.auth.R
import com.minhbka.miniapp.theme.MiniAppTheme
import com.minhbka.miniapp.theme.components.AppPreview

@Composable
fun SplashScreen() {
    Splash()
}

@Composable
fun Splash() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_launcher), contentDescription = "app icon", tint = MaterialTheme.colorScheme.primary)
    }
}

@AppPreview
@Composable
private fun SplashPreview() {
    MiniAppTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Splash()
        }
    }
}