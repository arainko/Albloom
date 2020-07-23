package com.rainko.albloom.network

import com.rainko.albloom.di.APIKey
import com.rainko.albloom.entities.network.Album
import retrofit2.await
import javax.inject.Inject

class LastFmApiManager @Inject constructor(
    private val lastfmAPI: LastfmAPI,
    private val apiKey: APIKey
) {

    suspend fun getAlbum(artistName: String, albumName: String): Album {
        val params = mapOf(
            "artist" to artistName,
            "album" to albumName
        )
        val methodParameters = generateMethodParameters("album.getInfo", params)
        return lastfmAPI.getAlbum(methodParameters).await().album
    }

    private fun generateMethodParameters(
        method: String,
        parameters: MethodParameters
    ): MethodParameters {
        val methodSpecificParameters = parameters + mapOf("method" to method)
        return configMethodParameters + methodSpecificParameters
    }

    private val configMethodParameters: MethodParameters
        get() = mapOf(
            "api_key" to apiKey,
            "format" to "json"
        )
}
