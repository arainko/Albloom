package com.rainko.albloom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.rainko.albloom.network.LastFmApiManager
import com.rainko.albloom.network.LastfmAPI
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.await
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val textView: TextView by lazy { findViewById<TextView>(R.id.test) }

    @Inject
    lateinit var lastfmApiManager: LastFmApiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            val result = lastfmApiManager.getAlbum("Gorillaz", "Gorillaz")
            launch(Dispatchers.Main) {
                textView.text = result.toString()
            }
        }

    }
}