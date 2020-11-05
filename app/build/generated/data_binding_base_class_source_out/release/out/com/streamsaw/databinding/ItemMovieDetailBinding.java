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
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.streamsaw.R;
import com.streamsaw.util.WishListIconView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemMovieDetailBinding extends ViewDataBinding {
  @NonNull
  public final Button ButtonPlayTrailer;

  @NonNull
  public final ImageView PlayButtonIcon;

  @NonNull
  public final LinearLayout RecycleViewTrailerLayout;

  @NonNull
  public final FrameLayout adViewContainer;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final ImageView backbutton;

  @NonNull
  public final LinearLayout bannerContainer;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final Button downloadMovie;

  @NonNull
  public final WishListIconView favoriteIcon;

  @NonNull
  public final ImageView imageMoviePoster;

  @NonNull
  public final NestedScrollView itemDetailContainer;

  @NonNull
  public final LinearLayout mPlay;

  @NonNull
  public final TextView mgenres;

  @NonNull
  public final CoordinatorLayout myCoordinatorLayout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final RecyclerView recyclerViewCastMovieDetail;

  @NonNull
  public final LinearLayout relatedNotFound;

  @NonNull
  public final ImageView report;

  @NonNull
  public final ProgressBar resumeProgressBar;

  @NonNull
  public final RecyclerView rvMylike;

  @NonNull
  public final ImageView shareIcon;

  @NonNull
  public final TextView textMovieRelease;

  @NonNull
  public final TextView textMovieTitle;

  @NonNull
  public final TextView textOverviewLabel;

  @NonNull
  public final TextView timeRemaning;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView viewMovieRating;

  protected ItemMovieDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button ButtonPlayTrailer, ImageView PlayButtonIcon, LinearLayout RecycleViewTrailerLayout,
      FrameLayout adViewContainer, AppBarLayout appBarLayout, ImageView backbutton,
      LinearLayout bannerContainer, CollapsingToolbarLayout collapsingToolbar, Button downloadMovie,
      WishListIconView favoriteIcon, ImageView imageMoviePoster,
      NestedScrollView itemDetailContainer, LinearLayout mPlay, TextView mgenres,
      CoordinatorLayout myCoordinatorLayout, ProgressBar progressBar, RatingBar ratingBar,
      RecyclerView recyclerViewCastMovieDetail, LinearLayout relatedNotFound, ImageView report,
      ProgressBar resumeProgressBar, RecyclerView rvMylike, ImageView shareIcon,
      TextView textMovieRelease, TextView textMovieTitle, TextView textOverviewLabel,
      TextView timeRemaning, Toolbar toolbar, TextView viewMovieRating) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ButtonPlayTrailer = ButtonPlayTrailer;
    this.PlayButtonIcon = PlayButtonIcon;
    this.RecycleViewTrailerLayout = RecycleViewTrailerLayout;
    this.adViewContainer = adViewContainer;
    this.appBarLayout = appBarLayout;
    this.backbutton = backbutton;
    this.bannerContainer = bannerContainer;
    this.collapsingToolbar = collapsingToolbar;
    this.downloadMovie = downloadMovie;
    this.favoriteIcon = favoriteIcon;
    this.imageMoviePoster = imageMoviePoster;
    this.itemDetailContainer = itemDetailContainer;
    this.mPlay = mPlay;
    this.mgenres = mgenres;
    this.myCoordinatorLayout = myCoordinatorLayout;
    this.progressBar = progressBar;
    this.ratingBar = ratingBar;
    this.recyclerViewCastMovieDetail = recyclerViewCastMovieDetail;
    this.relatedNotFound = relatedNotFound;
    this.report = report;
    this.resumeProgressBar = resumeProgressBar;
    this.rvMylike = rvMylike;
    this.shareIcon = shareIcon;
    this.textMovieRelease = textMovieRelease;
    this.textMovieTitle = textMovieTitle;
    this.textOverviewLabel = textOverviewLabel;
    this.timeRemaning = timeRemaning;
    this.toolbar = toolbar;
    this.viewMovieRating = viewMovieRating;
  }

  @NonNull
  public static ItemMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_movie_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMovieDetailBinding>inflateInternal(inflater, R.layout.item_movie_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMovieDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_movie_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMovieDetailBinding>inflateInternal(inflater, R.layout.item_movie_detail, null, false, component);
  }

  public static ItemMovieDetailBinding bind(@NonNull View view) {
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
  public static ItemMovieDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMovieDetailBinding)bind(component, view, R.layout.item_movie_detail);
  }
}