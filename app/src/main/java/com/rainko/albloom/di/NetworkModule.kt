package com.rainko.albloom.di

import android.content.Context
import com.rainko.albloom.R
import com.rainko.albloom.network.abstracts.LastfmApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@InstallIn(ApplicationComponent::class)
@Module
object NetworkModule {

    @Singleton
    @Provides
    fun provideLastfmAPIManager(): LastfmApi = Retrofit.Builder()
            .baseUrl("http://ws.audioscrobbler.com/2.0/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(LastfmApi::class.java)

    @Singleton
    @Provides
    fun provideApiKey(@ApplicationContext context: Context): String =
        context.resources.getString(R.string.lastfmApiKey)

}
