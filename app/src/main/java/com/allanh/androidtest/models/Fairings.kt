package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fairings (

	@SerializedName("reused") val reused : Boolean?,
	@SerializedName("recovery_attempt") val recovery_attempt : Boolean?,
	@SerializedName("recovered") val recovered : Boolean?,
	@SerializedName("ship") val ship : String?
): Parcelable