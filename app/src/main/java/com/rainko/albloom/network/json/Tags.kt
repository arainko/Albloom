package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class Tags(
    @SerializedName("tag")
    val tagList: List<Tag>
)