package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Telemetry (

	@SerializedName("flight_club") val flightClub : String?
): Parcelable