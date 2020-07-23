package com.rainko.albloom.entities.network


import com.google.gson.annotations.SerializedName
import com.rainko.albloom.entities.network.Track

data class Tracks(
    @SerializedName("track")
    val track: List<Track>
)