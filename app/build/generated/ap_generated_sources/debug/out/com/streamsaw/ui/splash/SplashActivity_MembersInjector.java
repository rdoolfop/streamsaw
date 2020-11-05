// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.splash;

import androidx.lifecycle.ViewModelProvider;
import com.streamsaw.ui.manager.AdsManager;
import com.streamsaw.ui.manager.SettingsManager;
import com.streamsaw.ui.manager.StatusManager;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AdsManager> adsManagerProvider;

  private final Provider<StatusManager> statusManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public SplashActivity_MembersInjector(Provider<SettingsManager> settingsManagerProvider,
      Provider<AdsManager> adsManagerProvider, Provider<StatusManager> statusManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.settingsManagerProvider = settingsManagerProvider;
    this.adsManagerProvider = adsManagerProvider;
    this.statusManagerProvider = statusManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SplashActivity> create(
      Provider<SettingsManager> settingsManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<StatusManager> statusManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new SplashActivity_MembersInjector(settingsManagerProvider, adsManagerProvider, statusManagerProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SplashActivity instance) {
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAdsManager(instance, adsManagerProvider.get());
    injectStatusManager(instance, statusManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.ui.splash.SplashActivity.settingsManager")
  public static void injectSettingsManager(SplashActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.splash.SplashActivity.adsManager")
  public static void injectAdsManager(SplashActivity instance, AdsManager adsManager) {
    instance.adsManager = adsManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.splash.SplashActivity.statusManager")
  public static void injectStatusManager(SplashActivity instance, StatusManager statusManager) {
    instance.statusManager = statusManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.splash.SplashActivity.viewModelFactory")
  public static void injectViewModelFactory(SplashActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}