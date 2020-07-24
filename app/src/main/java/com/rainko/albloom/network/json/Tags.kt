package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class Tags(
    @SerializedName("tag")
    val tag: List<Tag>
)