// Generated by Dagger (https://dagger.dev).
package com.papijeiboi.exam_project.di;

import com.papijeiboi.exam_project.api.TrackApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideTrackApiFactory implements Factory<TrackApi> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideTrackApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public TrackApi get() {
    return provideTrackApi(retrofitProvider.get());
  }

  public static AppModule_ProvideTrackApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideTrackApiFactory(retrofitProvider);
  }

  public static TrackApi provideTrackApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideTrackApi(retrofit));
  }
}
