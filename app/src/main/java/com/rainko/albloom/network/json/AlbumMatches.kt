package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class AlbumMatches(
    @SerializedName("album")
    val album: List<Album>
)