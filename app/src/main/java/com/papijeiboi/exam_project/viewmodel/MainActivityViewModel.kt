package com.papijeiboi.exam_project.viewmodel

import androidx.lifecycle.*
import com.papijeiboi.exam_project.data.Track
import com.papijeiboi.exam_project.data.TrackRepository
import com.papijeiboi.exam_project.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    repository: TrackRepository
) : ViewModel() {
    val tracks = repository.getTrack().asLiveData()
}

