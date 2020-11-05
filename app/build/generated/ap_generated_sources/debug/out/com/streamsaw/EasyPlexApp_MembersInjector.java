// Generated by Dagger (https://dagger.dev).
package com.streamsaw;

import com.streamsaw.ui.manager.SettingsManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EasyPlexApp_MembersInjector implements MembersInjector<EasyPlexApp> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public EasyPlexApp_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<EasyPlexApp> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new EasyPlexApp_MembersInjector(androidInjectorProvider, settingsManagerProvider);
  }

  @Override
  public void injectMembers(EasyPlexApp instance) {
    injectAndroidInjector(instance, androidInjectorProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.EasyPlexApp.androidInjector")
  public static void injectAndroidInjector(EasyPlexApp instance,
      DispatchingAndroidInjector<Object> androidInjector) {
    instance.androidInjector = androidInjector;
  }

  @InjectedFieldSignature("com.streamsaw.EasyPlexApp.settingsManager")
  public static void injectSettingsManager(EasyPlexApp instance, SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}