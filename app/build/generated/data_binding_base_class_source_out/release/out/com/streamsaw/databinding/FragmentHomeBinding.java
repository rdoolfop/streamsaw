// Generated by data binding compiler. Do not edit!
package com.streamsaw.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.streamsaw.R;
import java.lang.Deprecated;
import java.lang.Object;
import me.relex.circleindicator.CircleIndicator2;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout adViewContainer;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ImageView closeStatus;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ImageView imageAds;

  @NonNull
  public final CircleIndicator2 indicator;

  @NonNull
  public final LinearLayout linearLatestChannels;

  @NonNull
  public final ImageView linearLatestChannelsImage;

  @NonNull
  public final LinearLayout linearWatch;

  @NonNull
  public final ImageView linearWatchImage;

  @NonNull
  public final ImageView logoImageTop;

  @NonNull
  public final ImageView movieImage;

  @NonNull
  public final TextView movietitle;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button restartApp;

  @NonNull
  public final RecyclerView rvAnimes;

  @NonNull
  public final LinearLayout rvAnimesLinear;

  @NonNull
  public final RecyclerView rvCountinueWatching;

  @NonNull
  public final RecyclerView rvFeatured;

  @NonNull
  public final RecyclerView rvLatest;

  @NonNull
  public final RecyclerView rvLatestStreaming;

  @NonNull
  public final RecyclerView rvNewthisweek;

  @NonNull
  public final RecyclerView rvPopular;

  @NonNull
  public final RecyclerView rvRecommended;

  @NonNull
  public final RecyclerView rvSeriesPopular;

  @NonNull
  public final RecyclerView rvSeriesRecents;

  @NonNull
  public final RecyclerView rvTrending;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView viewAdText;

  @NonNull
  public final FrameLayout viewStatus;

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout adViewContainer, AppBarLayout appbar, ImageView closeStatus,
      ConstraintLayout constraintLayout, ImageView imageAds, CircleIndicator2 indicator,
      LinearLayout linearLatestChannels, ImageView linearLatestChannelsImage,
      LinearLayout linearWatch, ImageView linearWatchImage, ImageView logoImageTop,
      ImageView movieImage, TextView movietitle, ProgressBar progressBar, Button restartApp,
      RecyclerView rvAnimes, LinearLayout rvAnimesLinear, RecyclerView rvCountinueWatching,
      RecyclerView rvFeatured, RecyclerView rvLatest, RecyclerView rvLatestStreaming,
      RecyclerView rvNewthisweek, RecyclerView rvPopular, RecyclerView rvRecommended,
      RecyclerView rvSeriesPopular, RecyclerView rvSeriesRecents, RecyclerView rvTrending,
      NestedScrollView scrollView, Toolbar toolbar, TextView viewAdText, FrameLayout viewStatus) {
    super(_bindingComponent, _root, _localFieldCount);
    this.adViewContainer = adViewContainer;
    this.appbar = appbar;
    this.closeStatus = closeStatus;
    this.constraintLayout = constraintLayout;
    this.imageAds = imageAds;
    this.indicator = indicator;
    this.linearLatestChannels = linearLatestChannels;
    this.linearLatestChannelsImage = linearLatestChannelsImage;
    this.linearWatch = linearWatch;
    this.linearWatchImage = linearWatchImage;
    this.logoImageTop = logoImageTop;
    this.movieImage = movieImage;
    this.movietitle = movietitle;
    this.progressBar = progressBar;
    this.restartApp = restartApp;
    this.rvAnimes = rvAnimes;
    this.rvAnimesLinear = rvAnimesLinear;
    this.rvCountinueWatching = rvCountinueWatching;
    this.rvFeatured = rvFeatured;
    this.rvLatest = rvLatest;
    this.rvLatestStreaming = rvLatestStreaming;
    this.rvNewthisweek = rvNewthisweek;
    this.rvPopular = rvPopular;
    this.rvRecommended = rvRecommended;
    this.rvSeriesPopular = rvSeriesPopular;
    this.rvSeriesRecents = rvSeriesRecents;
    this.rvTrending = rvTrending;
    this.scrollView = scrollView;
    this.toolbar = toolbar;
    this.viewAdText = viewAdText;
    this.viewStatus = viewStatus;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, R.layout.fragment_home);
  }
}
