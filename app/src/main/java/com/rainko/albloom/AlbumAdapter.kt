package com.rainko.albloom

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.rainko.albloom.network.json.Album

class AlbumAdapter : ListAdapter<Album, AlbumViewHolder>() {
    companion object {
        val diffUtil: DiffUtil.ItemCallback<Album> = object : DiffUtil.ItemCallback<Album>()   {

            override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean =
                oldItem.mbid == newItem.mbid &&
                oldItem.artist == newItem.artist &&
                oldItem.name == newItem.name


            override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
                TODO("Not yet implemented")
            }

        }
    }
}