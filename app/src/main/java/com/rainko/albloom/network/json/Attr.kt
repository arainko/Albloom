package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class Attr(
    @SerializedName("rank")
    val rank: String
)