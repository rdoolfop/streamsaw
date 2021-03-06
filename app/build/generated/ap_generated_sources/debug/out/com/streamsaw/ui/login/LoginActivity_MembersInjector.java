// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.login;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.streamsaw.ui.manager.TokenManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public LoginActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new LoginActivity_MembersInjector(androidInjectorProvider, sharedPreferencesEditorProvider, tokenManagerProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectAndroidInjector(instance, androidInjectorProvider.get());
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.ui.login.LoginActivity.androidInjector")
  public static void injectAndroidInjector(LoginActivity instance,
      DispatchingAndroidInjector<Object> androidInjector) {
    instance.androidInjector = androidInjector;
  }

  @InjectedFieldSignature("com.streamsaw.ui.login.LoginActivity.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(LoginActivity instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.streamsaw.ui.login.LoginActivity.tokenManager")
  public static void injectTokenManager(LoginActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.login.LoginActivity.viewModelFactory")
  public static void injectViewModelFactory(LoginActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
