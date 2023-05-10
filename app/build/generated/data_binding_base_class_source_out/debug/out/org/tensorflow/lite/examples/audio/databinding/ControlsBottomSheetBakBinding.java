// Generated by view binder compiler. Do not edit!
package org.tensorflow.lite.examples.audio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.lite.examples.audio.R;

public final class ControlsBottomSheetBakBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final LinearLayoutCompat audioContainer;

  @NonNull
  public final NestedScrollView bottomSheetLayout;

  @NonNull
  public final TextView inferenceTimeLabel;

  @NonNull
  public final TextView inferenceTimeVal;

  @NonNull
  public final RadioGroup modelSelector;

  @NonNull
  public final AppCompatImageButton resultsMinus;

  @NonNull
  public final AppCompatImageButton resultsPlus;

  @NonNull
  public final TextView resultsValue;

  @NonNull
  public final RadioButton speechCommand;

  @NonNull
  public final AppCompatSpinner spinnerDelegate;

  @NonNull
  public final AppCompatSpinner spinnerOverlap;

  @NonNull
  public final AppCompatImageButton threadsMinus;

  @NonNull
  public final AppCompatImageButton threadsPlus;

  @NonNull
  public final TextView threadsValue;

  @NonNull
  public final AppCompatImageButton thresholdMinus;

  @NonNull
  public final AppCompatImageButton thresholdPlus;

  @NonNull
  public final TextView thresholdValue;

  @NonNull
  public final RadioButton yamnet;

  private ControlsBottomSheetBakBinding(@NonNull NestedScrollView rootView,
      @NonNull LinearLayoutCompat audioContainer, @NonNull NestedScrollView bottomSheetLayout,
      @NonNull TextView inferenceTimeLabel, @NonNull TextView inferenceTimeVal,
      @NonNull RadioGroup modelSelector, @NonNull AppCompatImageButton resultsMinus,
      @NonNull AppCompatImageButton resultsPlus, @NonNull TextView resultsValue,
      @NonNull RadioButton speechCommand, @NonNull AppCompatSpinner spinnerDelegate,
      @NonNull AppCompatSpinner spinnerOverlap, @NonNull AppCompatImageButton threadsMinus,
      @NonNull AppCompatImageButton threadsPlus, @NonNull TextView threadsValue,
      @NonNull AppCompatImageButton thresholdMinus, @NonNull AppCompatImageButton thresholdPlus,
      @NonNull TextView thresholdValue, @NonNull RadioButton yamnet) {
    this.rootView = rootView;
    this.audioContainer = audioContainer;
    this.bottomSheetLayout = bottomSheetLayout;
    this.inferenceTimeLabel = inferenceTimeLabel;
    this.inferenceTimeVal = inferenceTimeVal;
    this.modelSelector = modelSelector;
    this.resultsMinus = resultsMinus;
    this.resultsPlus = resultsPlus;
    this.resultsValue = resultsValue;
    this.speechCommand = speechCommand;
    this.spinnerDelegate = spinnerDelegate;
    this.spinnerOverlap = spinnerOverlap;
    this.threadsMinus = threadsMinus;
    this.threadsPlus = threadsPlus;
    this.threadsValue = threadsValue;
    this.thresholdMinus = thresholdMinus;
    this.thresholdPlus = thresholdPlus;
    this.thresholdValue = thresholdValue;
    this.yamnet = yamnet;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ControlsBottomSheetBakBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ControlsBottomSheetBakBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.controls_bottom_sheet_bak, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ControlsBottomSheetBakBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.audio_container;
      LinearLayoutCompat audioContainer = ViewBindings.findChildViewById(rootView, id);
      if (audioContainer == null) {
        break missingId;
      }

      NestedScrollView bottomSheetLayout = (NestedScrollView) rootView;

      id = R.id.inference_time_label;
      TextView inferenceTimeLabel = ViewBindings.findChildViewById(rootView, id);
      if (inferenceTimeLabel == null) {
        break missingId;
      }

      id = R.id.inference_time_val;
      TextView inferenceTimeVal = ViewBindings.findChildViewById(rootView, id);
      if (inferenceTimeVal == null) {
        break missingId;
      }

      id = R.id.model_selector;
      RadioGroup modelSelector = ViewBindings.findChildViewById(rootView, id);
      if (modelSelector == null) {
        break missingId;
      }

      id = R.id.results_minus;
      AppCompatImageButton resultsMinus = ViewBindings.findChildViewById(rootView, id);
      if (resultsMinus == null) {
        break missingId;
      }

      id = R.id.results_plus;
      AppCompatImageButton resultsPlus = ViewBindings.findChildViewById(rootView, id);
      if (resultsPlus == null) {
        break missingId;
      }

      id = R.id.results_value;
      TextView resultsValue = ViewBindings.findChildViewById(rootView, id);
      if (resultsValue == null) {
        break missingId;
      }

      id = R.id.speech_command;
      RadioButton speechCommand = ViewBindings.findChildViewById(rootView, id);
      if (speechCommand == null) {
        break missingId;
      }

      id = R.id.spinner_delegate;
      AppCompatSpinner spinnerDelegate = ViewBindings.findChildViewById(rootView, id);
      if (spinnerDelegate == null) {
        break missingId;
      }

      id = R.id.spinner_overlap;
      AppCompatSpinner spinnerOverlap = ViewBindings.findChildViewById(rootView, id);
      if (spinnerOverlap == null) {
        break missingId;
      }

      id = R.id.threads_minus;
      AppCompatImageButton threadsMinus = ViewBindings.findChildViewById(rootView, id);
      if (threadsMinus == null) {
        break missingId;
      }

      id = R.id.threads_plus;
      AppCompatImageButton threadsPlus = ViewBindings.findChildViewById(rootView, id);
      if (threadsPlus == null) {
        break missingId;
      }

      id = R.id.threads_value;
      TextView threadsValue = ViewBindings.findChildViewById(rootView, id);
      if (threadsValue == null) {
        break missingId;
      }

      id = R.id.threshold_minus;
      AppCompatImageButton thresholdMinus = ViewBindings.findChildViewById(rootView, id);
      if (thresholdMinus == null) {
        break missingId;
      }

      id = R.id.threshold_plus;
      AppCompatImageButton thresholdPlus = ViewBindings.findChildViewById(rootView, id);
      if (thresholdPlus == null) {
        break missingId;
      }

      id = R.id.threshold_value;
      TextView thresholdValue = ViewBindings.findChildViewById(rootView, id);
      if (thresholdValue == null) {
        break missingId;
      }

      id = R.id.yamnet;
      RadioButton yamnet = ViewBindings.findChildViewById(rootView, id);
      if (yamnet == null) {
        break missingId;
      }

      return new ControlsBottomSheetBakBinding((NestedScrollView) rootView, audioContainer,
          bottomSheetLayout, inferenceTimeLabel, inferenceTimeVal, modelSelector, resultsMinus,
          resultsPlus, resultsValue, speechCommand, spinnerDelegate, spinnerOverlap, threadsMinus,
          threadsPlus, threadsValue, thresholdMinus, thresholdPlus, thresholdValue, yamnet);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}