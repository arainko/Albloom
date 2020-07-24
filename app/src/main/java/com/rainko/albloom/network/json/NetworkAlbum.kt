package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class NetworkAlbum(
    @SerializedName("album")
    val album: Album
)