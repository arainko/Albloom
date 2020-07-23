package com.rainko.albloom.network

import com.rainko.albloom.entities.network.NetworkAlbum
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap

typealias MethodParameters = Map<String, String>

interface LastfmAPI {
    @GET(".")
    fun getAlbum(@QueryMap methodParams: MethodParameters): Call<NetworkAlbum>
}