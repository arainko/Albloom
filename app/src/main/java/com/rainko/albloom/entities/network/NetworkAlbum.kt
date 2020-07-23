package com.rainko.albloom.entities.network


import com.google.gson.annotations.SerializedName
import com.rainko.albloom.entities.network.Album

data class NetworkAlbum(
    @SerializedName("album")
    val album: Album
)