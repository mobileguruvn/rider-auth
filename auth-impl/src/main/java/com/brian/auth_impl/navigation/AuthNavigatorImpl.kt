package com.brian.auth_impl.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.brian.auth_contract.AuthNavigator
import com.brian.auth_impl.ui.LoginScreen
import javax.inject.Inject

class AuthNavigatorImpl @Inject constructor() : AuthNavigator {
    override fun authGraph(onLoginSuccess: () -> Unit): NavGraphBuilder.() -> Unit = {
        composable("login") { LoginScreen(onLoginSuccess) }
    }
}