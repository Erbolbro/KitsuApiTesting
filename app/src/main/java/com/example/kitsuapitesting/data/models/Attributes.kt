package com.example.kitsuapitesting.data.models

import com.google.gson.annotations.SerializedName

data class Attributes(@SerializedName("endDate")
                      val endDate: String = "",
                      @SerializedName("episodeCount")
                      val episodeCount: Int = 0,
                      @SerializedName("posterImage")
                      val posterImage: PosterImage,
                      @SerializedName("subtype")
                      val subtype: String = "",
                      @SerializedName("averageRating")
                      val averageRating: String = "",
                      @SerializedName("coverImage")
                      val coverImage: CoverImage,
                      @SerializedName("abbreviatedTitles")
                      val abbreviatedTitles: List<String>?,
                      @SerializedName("slug")
                      val slug: String = "",
                      @SerializedName("episodeLength")
                      val episodeLength: Int = 0,
                      @SerializedName("titles")
                      val titles: Titles,
                      @SerializedName("ageRating")
                      val ageRating: String = "",
                      @SerializedName("canonicalTitle")
                      val canonicalTitle: String = "",
                      @SerializedName("popularityRank")
                      val popularityRank: Int = 0,
                      @SerializedName("ageRatingGuide")
                      val startDate: String = "",
                      @SerializedName("status")
                      val status: String = "")