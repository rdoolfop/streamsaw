// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import com.streamsaw.ui.player.fsm.callback.AdInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAdInterfaceNoPrerollFactory implements Factory<AdInterface> {
  private final AppModule module;

  public AppModule_ProvideAdInterfaceNoPrerollFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public AdInterface get() {
    return provideAdInterfaceNoPreroll(module);
  }

  public static AppModule_ProvideAdInterfaceNoPrerollFactory create(AppModule module) {
    return new AppModule_ProvideAdInterfaceNoPrerollFactory(module);
  }

  public static AdInterface provideAdInterfaceNoPreroll(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideAdInterfaceNoPreroll(), "Cannot return null from a non-@Nullable @Provides method");
  }
}