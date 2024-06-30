package com.example.kitsuapitesting.data.models

import com.google.gson.annotations.SerializedName

data class KitsuResponse(
    @SerializedName("data")
    val data: List<DataItem>? = null)