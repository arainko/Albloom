package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class AlbumInfoWrapper(
    @SerializedName("album")
    val albumInfo: AlbumInfo
)