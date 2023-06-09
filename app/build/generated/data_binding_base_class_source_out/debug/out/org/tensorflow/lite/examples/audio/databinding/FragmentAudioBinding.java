// Generated by view binder compiler. Do not edit!
package org.tensorflow.lite.examples.audio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.lite.examples.audio.R;

public final class FragmentAudioBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CoordinatorLayout audioContainer;

  @NonNull
  public final ControlsBottomSheetBakBinding bottomSheetLayout;

  @NonNull
  public final RecyclerView recyclerView;

  private FragmentAudioBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CoordinatorLayout audioContainer,
      @NonNull ControlsBottomSheetBakBinding bottomSheetLayout,
      @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.audioContainer = audioContainer;
    this.bottomSheetLayout = bottomSheetLayout;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAudioBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAudioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_audio, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAudioBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CoordinatorLayout audioContainer = (CoordinatorLayout) rootView;

      id = R.id.bottom_sheet_layout;
      View bottomSheetLayout = ViewBindings.findChildViewById(rootView, id);
      if (bottomSheetLayout == null) {
        break missingId;
      }
      ControlsBottomSheetBakBinding binding_bottomSheetLayout = ControlsBottomSheetBakBinding.bind(bottomSheetLayout);

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new FragmentAudioBinding((CoordinatorLayout) rootView, audioContainer,
          binding_bottomSheetLayout, recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
