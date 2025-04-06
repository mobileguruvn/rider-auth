package com.brian.riderauth.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.brian.auth_contract.AuthNavigator

@Composable
fun AppNavigation(authNavigator: AuthNavigator) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "login") {
        with(authNavigator.authGraph {
            navController.navigate("home")
        }) {
            this()
        }
        composable("home") {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Logged in successfully!")
            }
        }
    }
}