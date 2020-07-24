package com.rainko.albloom.network.json


import com.google.gson.annotations.SerializedName

data class Results(
    @SerializedName("albummatches")
    val albumMatches: AlbumMatches,
    @SerializedName("@attr")
    val attr: Attr,
    @SerializedName("opensearch:itemsPerPage")
    val opensearchItemsPerPage: String,
    @SerializedName("opensearch:Query")
    val opensearchQuery: OpensearchQuery,
    @SerializedName("opensearch:startIndex")
    val opensearchStartIndex: String,
    @SerializedName("opensearch:totalResults")
    val opensearchTotalResults: String
)