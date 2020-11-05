// Generated by Dagger (https://dagger.dev).
package com.streamsaw.di.module;

import com.streamsaw.ui.player.fsm.listener.AdPlayingMonitor;
import com.streamsaw.ui.player.fsm.state_machine.FsmPlayer;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAdPlayingMonitorFactory implements Factory<AdPlayingMonitor> {
  private final AppModule module;

  private final Provider<FsmPlayer> playerProvider;

  public AppModule_ProvideAdPlayingMonitorFactory(AppModule module,
      Provider<FsmPlayer> playerProvider) {
    this.module = module;
    this.playerProvider = playerProvider;
  }

  @Override
  public AdPlayingMonitor get() {
    return provideAdPlayingMonitor(module, playerProvider.get());
  }

  public static AppModule_ProvideAdPlayingMonitorFactory create(AppModule module,
      Provider<FsmPlayer> playerProvider) {
    return new AppModule_ProvideAdPlayingMonitorFactory(module, playerProvider);
  }

  public static AdPlayingMonitor provideAdPlayingMonitor(AppModule instance, FsmPlayer player) {
    return Preconditions.checkNotNull(instance.provideAdPlayingMonitor(player), "Cannot return null from a non-@Nullable @Provides method");
  }
}