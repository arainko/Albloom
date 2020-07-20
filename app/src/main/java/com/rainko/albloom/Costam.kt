package com.rainko.albloom

import com.google.gson.annotations.SerializedName

data class Costam(
    @SerializedName("name")
    var name: String,

    @SerializedName("artist")
    var artist: String
)