package com.ktl1.kotlineasynavigationjetpackcompose

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class User(
    var name: String,
    var university: String
):Parcelable
