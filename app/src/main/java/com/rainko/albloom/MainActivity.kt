package com.rainko.albloom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://ws.audioscrobbler.com/2.0/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val lastfmApi = retrofit.create(LastfmRequest::class.java)
        val method = "album.getInfo"
        val apiKey = applicationContext.resources.getString(R.string.lastfmApiKey)

        val queries = mapOf(
            "method" to method,
            "api_key" to apiKey,
            "artist" to "Gorillaz",
            "album" to "Gorillaz",
            "format" to "json"
        )

        GlobalScope.launch {
            val result = lastfmApi.getTestAlbum(queries)
                .execute()
                .body()
            Log.d("DEBUG", "onCreate: ${result?.string()}")
        }

    }
}