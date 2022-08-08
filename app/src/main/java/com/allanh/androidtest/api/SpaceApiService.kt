package com.allanh.androidtest.api

import com.allanh.androidtest.models.LaunchData
import retrofit2.Response
import retrofit2.http.GET

interface SpaceApiService {
    @GET("/v3/launches")
    suspend fun fetchLaunchData(): Response<List<LaunchData>>
}