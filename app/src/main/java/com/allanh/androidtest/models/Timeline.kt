package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Timeline (

	@SerializedName("webcast_liftoff") val webcastLiftoff : Int?
): Parcelable