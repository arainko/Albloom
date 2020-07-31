package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class Tracks(
    @SerializedName("track")
    val trackList: List<Track>
)