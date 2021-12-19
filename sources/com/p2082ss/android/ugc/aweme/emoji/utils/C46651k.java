package com.p2082ss.android.ugc.aweme.emoji.utils;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.k */
public final class C46651k {
    static {
        Covode.recordClassIndex(55243);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.k$a */
    public static class View$OnTouchListenerC46653a implements View.OnTouchListener {

        /* renamed from: m */
        public GestureDetector f108782m;

        /* renamed from: n */
        public View.OnTouchListener f108783n;

        static {
            Covode.recordClassIndex(55245);
        }

        /* renamed from: a */
        public final void mo79269a(View... viewArr) {
            int i = 0;
            do {
                View view = viewArr[0];
                if (view != null) {
                    view.setOnTouchListener(this);
                }
                i++;
            } while (i <= 0);
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            GestureDetector gestureDetector = this.f108782m;
            if (gestureDetector != null) {
                z = gestureDetector.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                C46651k.m90057a(true, view, 0.5f);
            } else if (action == 1 || action == 3) {
                C46651k.m90057a(false, view, 0.5f);
            }
            View.OnTouchListener onTouchListener = this.f108783n;
            if (onTouchListener != null) {
                return z | onTouchListener.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    /* renamed from: a */
    public static void m90057a(boolean z, View view, float f) {
        float f2;
        float[] fArr = new float[2];
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        fArr[0] = f2;
        if (!z) {
            f = 1.0f;
        }
        fArr[1] = f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(100L);
        ofFloat.start();
    }
}
