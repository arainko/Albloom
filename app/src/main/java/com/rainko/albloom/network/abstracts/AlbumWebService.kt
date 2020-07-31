package com.rainko.albloom.network.abstracts

interface AlbumWebService {
    suspend fun getTopAlbumsByTag(tag: String, page: Int, limit: Int = 50): List<Album>
    suspend fun getAlbumInfo(artist: String, album: String): Album
    suspend fun searchForAlbum(album: String): List<Album>
}