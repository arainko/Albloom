package com.rainko.albloom.network.abstracts

import com.rainko.albloom.network.json.AlbumInfoWrapper
import com.rainko.albloom.network.json.AlbumPageWrapper
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LastfmApi {
    @GET(".")
    fun getAlbum(
        @Query("artist") artist: String,
        @Query("album") album: String,
        @Query("api_key") apiKey: String,
        @Query("method") method: String = "album.getInfo",
        @Query("format") format: String = "json"
    ): Call<AlbumInfoWrapper>

//    @GET(".")
//    fun searchForAlbum(
//        @Query("album") album: String,
//        @Query("api_key") apiKey: String,
//        @Query("method") method: String = "album.search",
//        @Query("format") format: String = "json"
//    ): Call<AlbumSearchResult>

    @GET(".")
    fun getTopAlbumsByTag(
        @Query("tag") tag: String,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String,
        @Query("limit") limit: Int = 50,
        @Query("method") method: String = "tag.getTopAlbums",
        @Query("format") format: String = "json"
    ): Call<AlbumPageWrapper>

}