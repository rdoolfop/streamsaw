// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.search;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.streamsaw.data.repository.SettingsRepository;
import com.streamsaw.ui.manager.AuthManager;
import com.streamsaw.ui.manager.SettingsManager;
import com.streamsaw.ui.manager.TokenManager;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DiscoverFragment_MembersInjector implements MembersInjector<DiscoverFragment> {
  private final Provider<SettingsRepository> authRepositoryProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<SharedPreferences> preferencesProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public DiscoverFragment_MembersInjector(Provider<SettingsRepository> authRepositoryProvider,
      Provider<TokenManager> tokenManagerProvider, Provider<SharedPreferences> preferencesProvider,
      Provider<AuthManager> authManagerProvider, Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.preferencesProvider = preferencesProvider;
    this.authManagerProvider = authManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<DiscoverFragment> create(
      Provider<SettingsRepository> authRepositoryProvider,
      Provider<TokenManager> tokenManagerProvider, Provider<SharedPreferences> preferencesProvider,
      Provider<AuthManager> authManagerProvider, Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new DiscoverFragment_MembersInjector(authRepositoryProvider, tokenManagerProvider, preferencesProvider, authManagerProvider, settingsManagerProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(DiscoverFragment instance) {
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectPreferences(instance, preferencesProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.ui.search.DiscoverFragment.authRepository")
  public static void injectAuthRepository(DiscoverFragment instance,
      SettingsRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.streamsaw.ui.search.DiscoverFragment.tokenManager")
  public static void injectTokenManager(DiscoverFragment instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.search.DiscoverFragment.preferences")
  public static void injectPreferences(DiscoverFragment instance, SharedPreferences preferences) {
    instance.preferences = preferences;
  }

  @InjectedFieldSignature("com.streamsaw.ui.search.DiscoverFragment.authManager")
  public static void injectAuthManager(DiscoverFragment instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.search.DiscoverFragment.settingsManager")
  public static void injectSettingsManager(DiscoverFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.search.DiscoverFragment.viewModelFactory")
  public static void injectViewModelFactory(DiscoverFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
