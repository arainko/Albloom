package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class TrackRank(
    @SerializedName("rank")
    val rank: String
)