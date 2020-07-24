package com.rainko.albloom.network.abstracts

import com.rainko.albloom.network.json.Album

interface AlbumWebService {
    suspend fun getAlbum(artist: String, album: String): Album
    suspend fun searchForAlbum(album: String): List<Album>
}