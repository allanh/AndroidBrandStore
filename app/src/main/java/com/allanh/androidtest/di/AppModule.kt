package com.allanh.androidtest.di

import com.allanh.androidtest.repository.SpaceRepository
import com.allanh.androidtest.view.LaunchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { SpaceRepository(get()) }
    viewModel { LaunchViewModel(get()) }
}
