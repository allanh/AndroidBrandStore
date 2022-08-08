package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LaunchData (

	@SerializedName("flight_number") val flight_number : Int?,
	@SerializedName("mission_name") val mission_name : String?,
	@SerializedName("mission_id") val mission_id : List<String>?,
	@SerializedName("upcoming") val upcoming : Boolean?,
	@SerializedName("launch_year") val launch_year : Int?,
	@SerializedName("launch_date_unix") val launch_date_unix : Int?,
	@SerializedName("launch_date_utc") val launch_date_utc : String?,
	@SerializedName("launch_date_local") val launch_date_local : String?,
	@SerializedName("is_tentative") val is_tentative : Boolean?,
	@SerializedName("tentative_max_precision") val tentative_max_precision : String?,
	@SerializedName("tbd") val tbd : Boolean?,
	@SerializedName("launch_window") val launch_window : Int?,
	@SerializedName("rocket") val rocket : Rocket?,
	@SerializedName("ships") val ships : List<String>?,
	@SerializedName("telemetry") val telemetry : Telemetry?,
	@SerializedName("launch_site") val launch_site : LaunchSite?,
	@SerializedName("launch_success") val launch_success : Boolean?,
	@SerializedName("launch_failure_details") val launch_failure_details : LaunchFailureDetails?,
	@SerializedName("links") val links : Links?,
	@SerializedName("details") val details : String?,
	@SerializedName("static_fire_date_utc") val static_fire_date_utc : String?,
	@SerializedName("static_fire_date_unix") val static_fire_date_unix : Int?,
	@SerializedName("timeline") val timeline : Timeline?,
	@SerializedName("crew") val crew : String?
): Parcelable