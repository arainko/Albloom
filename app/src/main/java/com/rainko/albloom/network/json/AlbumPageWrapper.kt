package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class AlbumPageWrapper(
    @SerializedName("albums")
    val albumPage: AlbumPage
)