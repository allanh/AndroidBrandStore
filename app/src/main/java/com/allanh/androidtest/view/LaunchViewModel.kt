package com.allanh.androidtest.view

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.allanh.androidtest.models.LaunchData
import com.allanh.androidtest.repository.SpaceRepository
import kotlinx.coroutines.Dispatchers
import retrofit2.Response

class LaunchViewModel(
    private val repository: SpaceRepository
) : ViewModel() {

    fun fetchLaunchData(): LiveData<Response<List<LaunchData>>> =
        liveData {
            emit(repository.fetchLaunchData())
        }
}