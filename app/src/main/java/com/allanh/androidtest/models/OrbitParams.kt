package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class OrbitParams (

	@SerializedName("reference_system") val reference_system : String?,
	@SerializedName("regime") val regime : String?,
	@SerializedName("longitude") val longitude : String?,
	@SerializedName("semi_major_axis_km") val semi_major_axis_km : String?,
	@SerializedName("eccentricity") val eccentricity : String?,
	@SerializedName("periapsis_km") val periapsis_km : Int?,
	@SerializedName("apoapsis_km") val apoapsis_km : Int?,
	@SerializedName("inclination_deg") val inclination_deg : Int?,
	@SerializedName("period_min") val period_min : String?,
	@SerializedName("lifespan_years") val lifespan_years : String?,
	@SerializedName("epoch") val epoch : String?,
	@SerializedName("mean_motion") val mean_motion : String?,
	@SerializedName("raan") val raan : String?,
	@SerializedName("arg_of_pericenter") val arg_of_pericenter : String?,
	@SerializedName("mean_anomaly") val mean_anomaly : String?
): Parcelable