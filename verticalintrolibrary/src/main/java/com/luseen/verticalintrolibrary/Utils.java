package com.luseen.verticalintrolibrary;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Chatikyan on 20.10.2016.
 */

class Utils {

    static void makeTranslationYAnimation(View view, AnimatorListenerAdapter listenerAdapter) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, view.getHeight());
        //objectAnimator.setStartDelay(100);
        objectAnimator.addListener(listenerAdapter);
        objectAnimator.setDuration(100);
        objectAnimator.start();
    }

    static void makeTranslationYAnimation(View view, long duration, AnimatorListenerAdapter listenerAdapter) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, view.getHeight());
        objectAnimator.setDuration(duration);
        objectAnimator.addListener(listenerAdapter);
        objectAnimator.start();
    }

    static void makeTranslationYAnimation(View view, long duration) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0);
        objectAnimator.setDuration(duration);
        objectAnimator.start();
    }
}
