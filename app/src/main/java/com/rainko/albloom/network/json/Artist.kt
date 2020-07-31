package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class Artist(
    @SerializedName("mbid")
    val musicbrainzId: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)