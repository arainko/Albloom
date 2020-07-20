package com.rainko.albloom

import com.rainko.albloom.entities.NetworkAlbum
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface LastfmRequest {
    @GET(".")
    fun getTestAlbum(@QueryMap methodMap: Map<String, String>): Call<NetworkAlbum>
}