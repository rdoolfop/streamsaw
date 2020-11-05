// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.player.activities;

import android.content.SharedPreferences;
import com.streamsaw.data.model.ads.AdRetriever;
import com.streamsaw.data.model.ads.CuePointsRetriever;
import com.streamsaw.data.repository.AnimeRepository;
import com.streamsaw.data.repository.MediaRepository;
import com.streamsaw.data.repository.SettingsRepository;
import com.streamsaw.ui.manager.AdsManager;
import com.streamsaw.ui.manager.AuthManager;
import com.streamsaw.ui.manager.SettingsManager;
import com.streamsaw.ui.manager.StatusManager;
import com.streamsaw.ui.manager.TokenManager;
import com.streamsaw.ui.player.bindings.PlayerController;
import com.streamsaw.ui.player.controller.PlayerAdLogicController;
import com.streamsaw.ui.player.controller.PlayerUIController;
import com.streamsaw.ui.player.fsm.callback.AdInterface;
import com.streamsaw.ui.player.fsm.listener.AdPlayingMonitor;
import com.streamsaw.ui.player.fsm.listener.CuePointMonitor;
import com.streamsaw.ui.player.fsm.state_machine.FsmPlayer;
import com.streamsaw.ui.player.interfaces.VpaidClient;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EasyPlexMainPlayer_MembersInjector implements MembersInjector<EasyPlexMainPlayer> {
  private final Provider<PlayerUIController> playerUIControllerProvider;

  private final Provider<AdsManager> adsManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<SettingsRepository> settingsRepositoryProvider;

  private final Provider<SettingsRepository> authRepositoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<FsmPlayer> fsmPlayerProvider;

  private final Provider<PlayerUIController> uiControllerProvider;

  private final Provider<AdPlayingMonitor> adPlayingMonitorProvider;

  private final Provider<CuePointMonitor> cuePointMonitorProvider;

  private final Provider<AdRetriever> adRetrieverProvider;

  private final Provider<CuePointsRetriever> cuePointsRetrieverProvider;

  private final Provider<AdInterface> adInterfaceProvider;

  private final Provider<PlayerAdLogicController> playerComponentControllerProvider;

  private final Provider<VpaidClient> vpaidClientProvider;

  private final Provider<SharedPreferences> preferencesProvider;

  private final Provider<SettingsManager> appSettingsManagerProvider;

  private final Provider<StatusManager> statusManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<PlayerController> playerControllerProvider;

  private final Provider<MediaRepository> repositoryProvider;

  private final Provider<AnimeRepository> animeRepositoryProvider;

  public EasyPlexMainPlayer_MembersInjector(Provider<PlayerUIController> playerUIControllerProvider,
      Provider<AdsManager> adsManagerProvider, Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthManager> authManagerProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<FsmPlayer> fsmPlayerProvider,
      Provider<PlayerUIController> uiControllerProvider,
      Provider<AdPlayingMonitor> adPlayingMonitorProvider,
      Provider<CuePointMonitor> cuePointMonitorProvider, Provider<AdRetriever> adRetrieverProvider,
      Provider<CuePointsRetriever> cuePointsRetrieverProvider,
      Provider<AdInterface> adInterfaceProvider,
      Provider<PlayerAdLogicController> playerComponentControllerProvider,
      Provider<VpaidClient> vpaidClientProvider, Provider<SharedPreferences> preferencesProvider,
      Provider<SettingsManager> appSettingsManagerProvider,
      Provider<StatusManager> statusManagerProvider, Provider<TokenManager> tokenManagerProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<PlayerController> playerControllerProvider,
      Provider<MediaRepository> repositoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider) {
    this.playerUIControllerProvider = playerUIControllerProvider;
    this.adsManagerProvider = adsManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.authManagerProvider = authManagerProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.settingsRepositoryProvider = settingsRepositoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.fsmPlayerProvider = fsmPlayerProvider;
    this.uiControllerProvider = uiControllerProvider;
    this.adPlayingMonitorProvider = adPlayingMonitorProvider;
    this.cuePointMonitorProvider = cuePointMonitorProvider;
    this.adRetrieverProvider = adRetrieverProvider;
    this.cuePointsRetrieverProvider = cuePointsRetrieverProvider;
    this.adInterfaceProvider = adInterfaceProvider;
    this.playerComponentControllerProvider = playerComponentControllerProvider;
    this.vpaidClientProvider = vpaidClientProvider;
    this.preferencesProvider = preferencesProvider;
    this.appSettingsManagerProvider = appSettingsManagerProvider;
    this.statusManagerProvider = statusManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.playerControllerProvider = playerControllerProvider;
    this.repositoryProvider = repositoryProvider;
    this.animeRepositoryProvider = animeRepositoryProvider;
  }

  public static MembersInjector<EasyPlexMainPlayer> create(
      Provider<PlayerUIController> playerUIControllerProvider,
      Provider<AdsManager> adsManagerProvider, Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthManager> authManagerProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<FsmPlayer> fsmPlayerProvider,
      Provider<PlayerUIController> uiControllerProvider,
      Provider<AdPlayingMonitor> adPlayingMonitorProvider,
      Provider<CuePointMonitor> cuePointMonitorProvider, Provider<AdRetriever> adRetrieverProvider,
      Provider<CuePointsRetriever> cuePointsRetrieverProvider,
      Provider<AdInterface> adInterfaceProvider,
      Provider<PlayerAdLogicController> playerComponentControllerProvider,
      Provider<VpaidClient> vpaidClientProvider, Provider<SharedPreferences> preferencesProvider,
      Provider<SettingsManager> appSettingsManagerProvider,
      Provider<StatusManager> statusManagerProvider, Provider<TokenManager> tokenManagerProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<PlayerController> playerControllerProvider,
      Provider<MediaRepository> repositoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider) {
    return new EasyPlexMainPlayer_MembersInjector(playerUIControllerProvider, adsManagerProvider, settingsManagerProvider, authManagerProvider, sharedPreferencesProvider, settingsRepositoryProvider, authRepositoryProvider, mediaRepositoryProvider, fsmPlayerProvider, uiControllerProvider, adPlayingMonitorProvider, cuePointMonitorProvider, adRetrieverProvider, cuePointsRetrieverProvider, adInterfaceProvider, playerComponentControllerProvider, vpaidClientProvider, preferencesProvider, appSettingsManagerProvider, statusManagerProvider, tokenManagerProvider, sharedPreferencesEditorProvider, playerControllerProvider, repositoryProvider, animeRepositoryProvider);
  }

  @Override
  public void injectMembers(EasyPlexMainPlayer instance) {
    EasyPlexPlayerActivity_MembersInjector.injectPlayerUIController(instance, playerUIControllerProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectAdsManager(instance, adsManagerProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectSettingsManager(instance, settingsManagerProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectAuthManager(instance, authManagerProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectSharedPreferences(instance, sharedPreferencesProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectSettingsRepository(instance, settingsRepositoryProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectAuthRepository(instance, authRepositoryProvider.get());
    EasyPlexPlayerActivity_MembersInjector.injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectFsmPlayer(instance, fsmPlayerProvider.get());
    injectUiController(instance, uiControllerProvider.get());
    injectAdPlayingMonitor(instance, adPlayingMonitorProvider.get());
    injectCuePointMonitor(instance, cuePointMonitorProvider.get());
    injectAdRetriever(instance, adRetrieverProvider.get());
    injectCuePointsRetriever(instance, cuePointsRetrieverProvider.get());
    injectAdInterface(instance, adInterfaceProvider.get());
    injectPlayerComponentController(instance, playerComponentControllerProvider.get());
    injectVpaidClient(instance, vpaidClientProvider.get());
    injectPreferences(instance, preferencesProvider.get());
    injectAppSettingsManager(instance, appSettingsManagerProvider.get());
    injectStatusManager(instance, statusManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectPlayerController(instance, playerControllerProvider.get());
    injectRepository(instance, repositoryProvider.get());
    injectAnimeRepository(instance, animeRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.fsmPlayer")
  public static void injectFsmPlayer(EasyPlexMainPlayer instance, FsmPlayer fsmPlayer) {
    instance.fsmPlayer = fsmPlayer;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.uiController")
  public static void injectUiController(EasyPlexMainPlayer instance,
      PlayerUIController uiController) {
    instance.uiController = uiController;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.adPlayingMonitor")
  public static void injectAdPlayingMonitor(EasyPlexMainPlayer instance,
      AdPlayingMonitor adPlayingMonitor) {
    instance.adPlayingMonitor = adPlayingMonitor;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.cuePointMonitor")
  public static void injectCuePointMonitor(EasyPlexMainPlayer instance,
      CuePointMonitor cuePointMonitor) {
    instance.cuePointMonitor = cuePointMonitor;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.adRetriever")
  public static void injectAdRetriever(EasyPlexMainPlayer instance, AdRetriever adRetriever) {
    instance.adRetriever = adRetriever;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.cuePointsRetriever")
  public static void injectCuePointsRetriever(EasyPlexMainPlayer instance,
      CuePointsRetriever cuePointsRetriever) {
    instance.cuePointsRetriever = cuePointsRetriever;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.adInterface")
  public static void injectAdInterface(EasyPlexMainPlayer instance, AdInterface adInterface) {
    instance.adInterface = adInterface;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.playerComponentController")
  public static void injectPlayerComponentController(EasyPlexMainPlayer instance,
      PlayerAdLogicController playerComponentController) {
    instance.playerComponentController = playerComponentController;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.vpaidClient")
  public static void injectVpaidClient(EasyPlexMainPlayer instance, VpaidClient vpaidClient) {
    instance.vpaidClient = vpaidClient;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.preferences")
  public static void injectPreferences(EasyPlexMainPlayer instance, SharedPreferences preferences) {
    instance.preferences = preferences;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.appSettingsManager")
  public static void injectAppSettingsManager(EasyPlexMainPlayer instance,
      SettingsManager appSettingsManager) {
    instance.appSettingsManager = appSettingsManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.statusManager")
  public static void injectStatusManager(EasyPlexMainPlayer instance, StatusManager statusManager) {
    instance.statusManager = statusManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.tokenManager")
  public static void injectTokenManager(EasyPlexMainPlayer instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(EasyPlexMainPlayer instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.playerController")
  public static void injectPlayerController(EasyPlexMainPlayer instance,
      PlayerController playerController) {
    instance.playerController = playerController;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.repository")
  public static void injectRepository(EasyPlexMainPlayer instance, MediaRepository repository) {
    instance.repository = repository;
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.activities.EasyPlexMainPlayer.animeRepository")
  public static void injectAnimeRepository(EasyPlexMainPlayer instance,
      AnimeRepository animeRepository) {
    instance.animeRepository = animeRepository;
  }
}