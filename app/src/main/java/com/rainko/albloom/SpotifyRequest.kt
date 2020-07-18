package com.rainko.albloom

import retrofit2.Call
import retrofit2.http.GET

interface SpotifyRequest {
    @GET("v1/albums/0sNOF9WDwhWunNAHPD3Baj")
    fun getTestAlbum(): Call<List<String>>
}