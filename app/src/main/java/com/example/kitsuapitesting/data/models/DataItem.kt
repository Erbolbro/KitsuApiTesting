package com.example.kitsuapitesting.data.models

import com.google.gson.annotations.SerializedName

data class DataItem(@SerializedName("relationships")
                    val relationships: Relationships,
                    @SerializedName("attributes")
                    val attributes: Attributes,
                    @SerializedName("id")
                    val id: String = "",
                    @SerializedName("type")
                    val type: String = "")