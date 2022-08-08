package com.allanh.androidtest.repository

import android.content.Context
import com.allanh.androidtest.api.SpaceApiService
import com.allanh.androidtest.models.LaunchData
import retrofit2.Response

class SpaceRepository constructor(
    private val spaceApiService: SpaceApiService
) {
    //取得賣場資料
    suspend fun fetchLaunchData(): Response<List<LaunchData>> {
        return spaceApiService.fetchLaunchData()
    }
}