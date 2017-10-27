package com.skaliotisdev.github.repositories

import com.google.gson.annotations.SerializedName

/*
    Created By Spiros Skaliotis 27/10/2017
 */

data class RepositoryItem(
        @SerializedName("login") val strLogin: String,
        @SerializedName("full_name") val strFullName: String,
        @SerializedName("description") val strDescription : String,
        @SerializedName("url") val strUrl : String,
        @SerializedName("stars") val intStars: Int,
        @SerializedName("score") val intScore : Int
)

data class Result (
        val total_count: Int,
        val incomplete_results: Boolean,
        val items: List<RepositoryItem>
)