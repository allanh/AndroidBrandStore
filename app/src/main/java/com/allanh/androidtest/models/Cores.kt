package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cores (

	@SerializedName("core_serial") val core_serial : String?,
	@SerializedName("flight") val flight : Int?,
	@SerializedName("block") val block : String?,
	@SerializedName("gridfins") val gridfins : Boolean?,
	@SerializedName("legs") val legs : Boolean?,
	@SerializedName("reused") val reused : Boolean?,
	@SerializedName("land_success") val land_success : String?,
	@SerializedName("landing_intent") val landing_intent : Boolean?,
	@SerializedName("landing_type") val landing_type : String?,
	@SerializedName("landing_vehicle") val landing_vehicle : String?
): Parcelable