// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import com.streamsaw.data.local.EasyPlexDatabase;
import com.streamsaw.data.local.dao.DownloadDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideProgressDaoFactory implements Factory<DownloadDao> {
  private final AppModule module;

  private final Provider<EasyPlexDatabase> dbProvider;

  public AppModule_ProvideProgressDaoFactory(AppModule module,
      Provider<EasyPlexDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public DownloadDao get() {
    return provideProgressDao(module, dbProvider.get());
  }

  public static AppModule_ProvideProgressDaoFactory create(AppModule module,
      Provider<EasyPlexDatabase> dbProvider) {
    return new AppModule_ProvideProgressDaoFactory(module, dbProvider);
  }

  public static DownloadDao provideProgressDao(AppModule instance, EasyPlexDatabase db) {
    return Preconditions.checkNotNull(instance.provideProgressDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}