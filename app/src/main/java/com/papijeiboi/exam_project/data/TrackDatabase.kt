package com.papijeiboi.exam_project.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TrackResult::class], version = 1)
abstract class TrackDatabase: RoomDatabase() {

    abstract fun trackDao(): TrackDao
}