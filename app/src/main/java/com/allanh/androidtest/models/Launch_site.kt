package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LaunchSite (

	@SerializedName("site_id") val site_id : String?,
	@SerializedName("site_name") val site_name : String?,
	@SerializedName("site_name_long") val site_name_long : String?
): Parcelable