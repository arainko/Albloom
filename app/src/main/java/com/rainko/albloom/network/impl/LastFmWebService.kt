package com.rainko.albloom.network.impl

import com.rainko.albloom.network.json.Album
import com.rainko.albloom.network.abstracts.AlbumWebService
import com.rainko.albloom.network.abstracts.LastfmAPI
import com.rainko.albloom.network.abstracts.WebService
import retrofit2.await
import javax.inject.Inject

class LastFmWebService @Inject constructor(
    lastfmApi: LastfmAPI,
    apiKey: String
) : WebService(lastfmApi, apiKey),
    AlbumWebService {

    override suspend fun getAlbum(artist: String, album: String): Album {
        return lastfmAPI.getAlbum(artist, album, apiKey)
            .await()
            .album
    }

    override suspend fun searchForAlbum(album: String): List<Album> {
        return lastfmAPI.searchForAlbum(album, apiKey)
            .await()
            .results
            .albumMatches
            .album
    }
}
