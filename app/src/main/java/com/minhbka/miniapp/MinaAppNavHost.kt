package com.minhbka.miniapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.minhbka.auth.authNavGraph
import com.minhbka.auth.authRoute

@Composable
fun MiniAppNavHost(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = authRoute){
        authNavGraph(
            navController = navHostController,
            onAuthSuccess = {

            }
        )
    }
}