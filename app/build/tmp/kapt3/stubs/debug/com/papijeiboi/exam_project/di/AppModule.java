package com.papijeiboi.exam_project.di;

import android.app.Application;
import androidx.room.Room;
import com.papijeiboi.exam_project.api.TrackApi;
import com.papijeiboi.exam_project.data.TrackDatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/papijeiboi/exam_project/di/AppModule;", "", "()V", "provideDatabase", "Lcom/papijeiboi/exam_project/data/TrackDatabase;", "app", "Landroid/app/Application;", "provideRetrofit", "Lretrofit2/Retrofit;", "provideTrackApi", "Lcom/papijeiboi/exam_project/api/TrackApi;", "retrofit", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.papijeiboi.exam_project.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.papijeiboi.exam_project.api.TrackApi provideTrackApi(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.papijeiboi.exam_project.data.TrackDatabase provideDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
}