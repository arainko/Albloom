package com.rainko.albloom.entities.network


import com.google.gson.annotations.SerializedName
import com.rainko.albloom.entities.network.Artist
import com.rainko.albloom.entities.network.Attr
import com.rainko.albloom.entities.network.Streamable

data class Track(
    @SerializedName("artist")
    val artist: Artist,
    @SerializedName("@attr")
    val attr: Attr,
    @SerializedName("duration")
    val duration: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("streamable")
    val streamable: Streamable,
    @SerializedName("url")
    val url: String
)