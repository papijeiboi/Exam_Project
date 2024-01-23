package com.papijeiboi.exam_project.api

import com.papijeiboi.exam_project.data.Track
import retrofit2.http.GET

interface TrackApi {

    companion object {
        const val BASE_URL = "https://itunes.apple.com/search/"
    }

    //Return list of track objects
    @GET("?term=star&amp;country=au&amp;media=movie&amp;all")
    suspend fun getTrack(): Track
}