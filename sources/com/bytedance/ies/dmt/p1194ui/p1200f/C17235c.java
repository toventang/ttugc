package com.bytedance.ies.dmt.p1194ui.p1200f;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.f.c */
public final class C17235c {
    static {
        Covode.recordClassIndex(19696);
    }

    /* renamed from: a */
    public static void m31810a(View view, final float f) {
        view.setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.ies.dmt.p1194ui.p1200f.C17235c.View$OnTouchListenerC172361 */

            static {
                Covode.recordClassIndex(19697);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    C17235c.m31811a(true, view, f);
                } else if (action == 1 || action == 3) {
                    C17235c.m31811a(false, view, f);
                }
                return false;
            }
        });
    }

    /* renamed from: com.bytedance.ies.dmt.ui.f.c$a */
    public static class View$OnTouchListenerC17237a implements View.OnTouchListener {

        /* renamed from: a */
        public GestureDetector f41170a;

        /* renamed from: b */
        public View.OnTouchListener f41171b;

        static {
            Covode.recordClassIndex(19698);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            GestureDetector gestureDetector = this.f41170a;
            if (gestureDetector != null) {
                z = gestureDetector.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                C17235c.m31811a(true, view, 0.5f);
            } else if (action == 1 || action == 3) {
                C17235c.m31811a(false, view, 0.5f);
            }
            View.OnTouchListener onTouchListener = this.f41171b;
            if (onTouchListener != null) {
                return z | onTouchListener.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    /* renamed from: a */
    public static void m31811a(boolean z, View view, float f) {
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
