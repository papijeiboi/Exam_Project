package com.papijeiboi.exam_project.viewmodel;

import androidx.lifecycle.*;
import com.papijeiboi.exam_project.data.Track;
import com.papijeiboi.exam_project.data.TrackRepository;
import com.papijeiboi.exam_project.util.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/papijeiboi/exam_project/viewmodel/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/papijeiboi/exam_project/data/TrackRepository;", "(Lcom/papijeiboi/exam_project/data/TrackRepository;)V", "tracks", "Landroidx/lifecycle/LiveData;", "Lcom/papijeiboi/exam_project/util/Resource;", "", "Lcom/papijeiboi/exam_project/data/TrackResult;", "getTracks", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.papijeiboi.exam_project.util.Resource<java.util.List<com.papijeiboi.exam_project.data.TrackResult>>> tracks = null;
    
    @javax.inject.Inject
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull
    com.papijeiboi.exam_project.data.TrackRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.papijeiboi.exam_project.util.Resource<java.util.List<com.papijeiboi.exam_project.data.TrackResult>>> getTracks() {
        return null;
    }
}