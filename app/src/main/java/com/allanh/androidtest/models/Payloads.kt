package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Payloads (

	@SerializedName("payload_id") val payload_id : String?,
	@SerializedName("norad_id") val norad_id : List<String>?,
	@SerializedName("reused") val reused : Boolean?,
	@SerializedName("customers") val customers : List<String>?,
	@SerializedName("nationality") val nationality : String?,
	@SerializedName("manufacturer") val manufacturer : String?,
	@SerializedName("payload_type") val payload_type : String?,
	@SerializedName("payload_mass_kg") val payload_mass_kg : Int?,
	@SerializedName("payload_mass_lbs") val payload_mass_lbs : Int?,
	@SerializedName("orbit") val orbit : String?,
	@SerializedName("orbit_params") val orbit_params : OrbitParams?
): Parcelable