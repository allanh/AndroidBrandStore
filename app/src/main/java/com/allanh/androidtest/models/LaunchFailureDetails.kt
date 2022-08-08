package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LaunchFailureDetails (

	@SerializedName("time") val time : Int?,
	@SerializedName("altitude") val altitude : String?,
	@SerializedName("reason") val reason : String?
): Parcelable