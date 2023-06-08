package com.yakkshit.GoogleFit.activity;

import android.view.View;

import com.yakkshit.GoogleFit.model.Workout;

/**
 * Created by Chris Black
 *
 * Callbacks specific to the MainActivity
 */
public interface IMainActivityCallback {
    void launch(View transitionView, Workout workout);
    void quickDataRead();
    void setStepCounting(boolean active);
    void setActivityTracking(boolean active);
}
