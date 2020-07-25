package com.rainko.albloom

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.rainko.albloom.network.json.Album
import com.rainko.albloom.network.impl.LastFmWebService

class AlbumViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle,
    private val webService: LastFmWebService
) : ViewModel() {

    suspend fun searchAlbum(album: String): List<Album> = webService.searchForAlbum(album)
    suspend fun getAlbum(album: String, artist: String): Album = webService.getAlbum(artist, album)
}