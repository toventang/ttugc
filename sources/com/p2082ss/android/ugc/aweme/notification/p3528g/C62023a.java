package com.p2082ss.android.ugc.aweme.notification.p3528g;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.notification.g.a */
public final class C62023a {
    static {
        Covode.recordClassIndex(72777);
    }

    /* renamed from: a */
    public static void m112168a(View view) {
        view.setOnTouchListener(new View.OnTouchListener() {
            /* class com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a.View$OnTouchListenerC620241 */

            static {
                Covode.recordClassIndex(72778);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    C62023a.m112169a(true, view);
                } else if (action == 1 || action == 3) {
                    C62023a.m112169a(false, view);
                }
                return false;
            }
        });
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.g.a$a */
    public static class View$OnTouchListenerC62025a implements View.OnTouchListener {

        /* renamed from: a */
        public GestureDetector f140761a;

        /* renamed from: b */
        public View.OnTouchListener f140762b;

        static {
            Covode.recordClassIndex(72779);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            GestureDetector gestureDetector = this.f140761a;
            if (gestureDetector != null) {
                z = gestureDetector.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                C62023a.m112169a(true, view);
            } else if (action == 1 || action == 3) {
                C62023a.m112169a(false, view);
            }
            View.OnTouchListener onTouchListener = this.f140762b;
            if (onTouchListener != null) {
                return z | onTouchListener.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    /* renamed from: a */
    public static void m112169a(boolean z, View view) {
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.5f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(100L);
        ofFloat.start();
    }
}
