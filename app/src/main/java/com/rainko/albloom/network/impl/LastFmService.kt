package com.rainko.albloom.network.impl

import com.rainko.albloom.network.abstracts.AlbumWebService
import com.rainko.albloom.network.abstracts.LastfmApi
import com.rainko.albloom.network.abstracts.WebService
import com.rainko.albloom.network.json.Album
import com.rainko.albloom.network.json.AlbumInfo
import retrofit2.await
import javax.inject.Inject

class LastFmService @Inject constructor(
    lastfmApi: LastfmApi,
    apiKey: String
) : WebService(lastfmApi, apiKey),
    AlbumWebService {

    override suspend fun getTopAlbumsByTag(tag: String, page: Int, limit: Int): List<Album> {
        return lastfmApi.getTopAlbumsByTag(tag, page, apiKey)
            .await()
            .albumPage
            .albumList
    }


    override suspend fun getAlbumInfo(artist: String, album: String): AlbumInfo {
        return lastfmApi.getAlbum(artist, album, apiKey)
            .await()
            .albumInfo
    }

    override suspend fun searchForAlbum(album: String): List<Album> {
        TODO()
//        return lastfmApi.searchForAlbum(album, apiKey)
//            .await()
//            .results
//            .albumMatches
//            .album
    }
}
