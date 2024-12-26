package com.example.mikhalev_pr22102_20

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigator(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") { /**/ }
        composable("personal_area") { /**/ }
        composable("notice") { /**/) }
    }
}