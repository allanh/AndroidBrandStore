package com.allanh.androidtest.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FirstStage (

	@SerializedName("cores") val cores : List<Cores>?
): Parcelable