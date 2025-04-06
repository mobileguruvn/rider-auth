package com.brian.auth_contract

import androidx.navigation.NavGraphBuilder

interface AuthNavigator {
    fun authGraph(onLoginSuccess: () -> Unit) : NavGraphBuilder.() -> Unit
}