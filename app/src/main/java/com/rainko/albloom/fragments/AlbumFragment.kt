package com.rainko.albloom.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import androidx.viewbinding.ViewBinding
import com.bumptech.glide.Glide
import com.rainko.albloom.AlbumViewModel
import com.rainko.albloom.databinding.AlbumFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
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

        binding.getAlbumCoverButton.setOnClickListener {
            viewModel.viewModelScope.launch {
                val searchRes = viewModel.getAlbum(
                    binding.albumNameEditText.text.toString(),
                    binding.artistNameEditText.text.toString()
                )
                launch(Dispatchers.Main) {
                    Glide.with(this@AlbumFragment)
                        .load(searchRes.image[3].url)
                        .override(600)
                        .thumbnail(0.1f)
                        .into(binding.image)
                }
            }
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}