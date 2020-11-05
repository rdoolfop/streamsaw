// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.viewmodels;

import com.streamsaw.ui.manager.SettingsManager;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsViewModel_MembersInjector implements MembersInjector<SettingsViewModel> {
  private final Provider<SettingsManager> settingsManagerProvider;

  public SettingsViewModel_MembersInjector(Provider<SettingsManager> settingsManagerProvider) {
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<SettingsViewModel> create(
      Provider<SettingsManager> settingsManagerProvider) {
    return new SettingsViewModel_MembersInjector(settingsManagerProvider);
  }

  @Override
  public void injectMembers(SettingsViewModel instance) {
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.ui.viewmodels.SettingsViewModel.settingsManager")
  public static void injectSettingsManager(SettingsViewModel instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}