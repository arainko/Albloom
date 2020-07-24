package com.rainko.albloom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rainko.albloom.network.impl.LastFmWebService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var lastfmWebService: LastFmWebService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}