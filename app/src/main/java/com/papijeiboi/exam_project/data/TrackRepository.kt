package com.papijeiboi.exam_project.data

import androidx.room.withTransaction
import com.papijeiboi.exam_project.api.TrackApi
import com.papijeiboi.exam_project.util.networkBoundResource
import kotlinx.coroutines.delay
import javax.inject.Inject

class TrackRepository @Inject constructor(
    private val api: TrackApi,
    private val db: TrackDatabase
) {

    private val personDao = db.trackDao()

    fun getTrack() = networkBoundResource(
        query = {
            personDao.getAllTrack()
        },
        fetch = {
            delay(2000)
            api.getTrack()
        },
        savedFetchResult = { track ->
            db.withTransaction {
                personDao.deleteAllTrack()
                personDao.insertTrack(track.results)
            }

        }
    )
}