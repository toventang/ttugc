package com.p2082ss.android.ugc.aweme.shortvideo.widget.p3890a;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.a.b */
public final class C74268b {
    static {
        Covode.recordClassIndex(87040);
    }

    /* renamed from: a */
    public static void m130674a(View view) {
        view.setOnTouchListener(new View.OnTouchListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.p3890a.C74268b.View$OnTouchListenerC742702 */

            static {
                Covode.recordClassIndex(87042);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    C74268b.m130675a(view, true);
                } else if (action == 1 || action == 3) {
                    C74268b.m130675a(view, false);
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    public static void m130675a(View view, boolean z) {
        float f;
        ViewPropertyAnimator animate = view.animate();
        float f2 = 1.2f;
        if (z) {
            f = 1.2f;
        } else {
            f = 1.0f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f);
        if (!z) {
            f2 = 1.0f;
        }
        scaleX.scaleY(f2).setDuration(100).start();
    }

    /* renamed from: a */
    public static void m130676a(boolean z, View view) {
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
