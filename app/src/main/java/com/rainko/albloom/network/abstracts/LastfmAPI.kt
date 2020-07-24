package com.rainko.albloom.network.abstracts

import com.rainko.albloom.network.json.AlbumSearchResult
import com.rainko.albloom.network.json.NetworkAlbum
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

typealias MethodParameters = Map<String, String>

interface LastfmAPI {
    @GET(".")
    fun getAlbum(
        @Query("artist") artist: String,
        @Query("album") album: String,
        @Query("api_key") apiKey: String,
        @Query("method") method: String = Methods.Album.GET_INFO,
        @Query("format") format: String = "json"
    ): Call<NetworkAlbum>

    @GET(".")
    fun searchForAlbum(
        @Query("album") album: String,
        @Query("api_key") apiKey: String,
        @Query("method") method: String = Methods.Album.SEARCH,
        @Query("format") format: String = "json"
    ): Call<AlbumSearchResult>

    object Methods {
        object Album {
            val GET_INFO = "album.getInfo"
            val GET_TAGS = "album.getTags"
            val GET_TOP_TAGS = "album.getTopTags"
            val SEARCH = "album.search"
        }

        object Artist {
            val GET_INFO = "artist.getInfo"

        }
    }
}