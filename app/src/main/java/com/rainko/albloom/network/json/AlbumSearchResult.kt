package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class AlbumSearchResult(
    @SerializedName("results")
    val results: Results
)