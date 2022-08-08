package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class SecondStage (

	@SerializedName("block") val block : Int?,
	@SerializedName("payloads") val payloads : List<Payloads>?
): Parcelable