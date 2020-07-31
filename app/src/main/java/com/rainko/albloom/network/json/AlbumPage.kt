package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class AlbumPage(
    @SerializedName("album")
    val albumList: List<Album>,
    @SerializedName("@attr")
    val pageAttributes: PageAttributes
)