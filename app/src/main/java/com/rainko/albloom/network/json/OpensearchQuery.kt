package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class OpensearchQuery(
    @SerializedName("role")
    val role: String,
    @SerializedName("searchTerms")
    val searchTerms: String,
    @SerializedName("startPage")
    val startPage: String,
    @SerializedName("#text")
    val text: String
)