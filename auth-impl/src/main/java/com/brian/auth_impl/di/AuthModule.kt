package com.brian.auth_impl.di

import com.brian.auth_contract.AuthNavigator
import com.brian.auth_impl.navigation.AuthNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AuthModule {
    @Binds
    abstract fun bindAuthNavigator(impl: AuthNavigatorImpl): AuthNavigator
}