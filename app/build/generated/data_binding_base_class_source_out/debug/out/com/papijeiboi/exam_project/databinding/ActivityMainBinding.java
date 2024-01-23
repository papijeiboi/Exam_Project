// Generated by view binder compiler. Do not edit!
package com.papijeiboi.exam_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.papijeiboi.exam_project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ProgressBar pbTrack;

  @NonNull
  public final RecyclerView rvTrack;

  @NonNull
  public final SwipeRefreshLayout swRefresh;

  @NonNull
  public final TextView tvError;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull ProgressBar pbTrack,
      @NonNull RecyclerView rvTrack, @NonNull SwipeRefreshLayout swRefresh,
      @NonNull TextView tvError) {
    this.rootView = rootView;
    this.pbTrack = pbTrack;
    this.rvTrack = rvTrack;
    this.swRefresh = swRefresh;
    this.tvError = tvError;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pb_track;
      ProgressBar pbTrack = ViewBindings.findChildViewById(rootView, id);
      if (pbTrack == null) {
        break missingId;
      }

      id = R.id.rv_track;
      RecyclerView rvTrack = ViewBindings.findChildViewById(rootView, id);
      if (rvTrack == null) {
        break missingId;
      }

      id = R.id.sw_refresh;
      SwipeRefreshLayout swRefresh = ViewBindings.findChildViewById(rootView, id);
      if (swRefresh == null) {
        break missingId;
      }

      id = R.id.tv_error;
      TextView tvError = ViewBindings.findChildViewById(rootView, id);
      if (tvError == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, pbTrack, rvTrack, swRefresh,
          tvError);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
