package com.brian.auth_impl.navigation

sealed class AuthRoutes(val route: String) {
    object Login: AuthRoutes("login")
}