package com.rainko.albloom.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import com.rainko.albloom.AlbumViewModel
import com.rainko.albloom.R
import com.rainko.albloom.databinding.AlbumFragmentBinding
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AlbumFragment : Fragment() {
    private var _binding: AlbumFragmentBinding? = null
    private val binding: AlbumFragmentBinding
        get() = _binding!!

    private val viewModel: AlbumViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = AlbumFragmentBinding.inflate(inflater, container, false).run {
            _binding = this
            root
        }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.viewModelScope.launch {
            val searchRes = viewModel.getAlbum("A Moon Shaped Pool", "Radiohead")
            launch(Dispatchers.Main) {
                Picasso.get()
                    .load(searchRes.image[4].url)
                    .resize(600, 600)
                    .into(binding.image)
//                binding.testText.text = searchRes.tracks.track.toString()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}