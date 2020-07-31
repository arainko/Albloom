package com.rainko.albloom

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.rainko.albloom.network.impl.LastFmService

class AlbumViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle,
    private val service: LastFmService
) : ViewModel() {

    suspend fun searchAlbum(album: String): List<Album> = service.searchForAlbum(album)
    suspend fun getAlbum(album: String, artist: String): Album = service.getAlbumInfo(artist, album)
}