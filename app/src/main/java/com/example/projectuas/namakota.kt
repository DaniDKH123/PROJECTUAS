package com.example.projectuas

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class namakota(
    val imgnamakota: Int,
    val namenamakota: String,
    val descnamakota: String,
    val desc2namakota: String,
):Parcelable
