package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Rocket (

	@SerializedName("rocket_id") val rocketId : String?,
	@SerializedName("rocket_name") val rocketName : String?,
	@SerializedName("rocket_type") val rocketType : String?,
	@SerializedName("first_stage") val firstStage : FirstStage?,
	@SerializedName("second_stage") val secondStage : SecondStage?,
	@SerializedName("fairings") val fairings : Fairings?
): Parcelable