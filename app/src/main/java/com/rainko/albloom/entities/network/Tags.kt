package com.rainko.albloom.entities.network


import com.google.gson.annotations.SerializedName
import com.rainko.albloom.entities.network.Tag

data class Tags(
    @SerializedName("tag")
    val tag: List<Tag>
)