package com.rainko.albloom.entities


import com.google.gson.annotations.SerializedName

data class NetworkAlbum(
    @SerializedName("album")
    val album: Album
)