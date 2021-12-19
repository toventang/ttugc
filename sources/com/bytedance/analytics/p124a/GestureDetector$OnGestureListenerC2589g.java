package com.bytedance.analytics.p124a;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.analytics.p125b.C2594b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.analytics.a.g */
public final class GestureDetector$OnGestureListenerC2589g extends FrameLayout implements GestureDetector.OnGestureListener {

    /* renamed from: a */
    private final GestureDetector f7802a;

    /* renamed from: b */
    private float f7803b;

    /* renamed from: c */
    private float f7804c;

    static {
        Covode.recordClassIndex(2976);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetector$OnGestureListenerC2589g(Context context) {
        super(context);
        MethodCollector.m26663i(5662);
        this.f7802a = new GestureDetector(context, this);
        MethodCollector.m26664o(5662);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7803b = motionEvent.getX();
            this.f7804c = motionEvent.getY();
        } else if (action == 1) {
            postDelayed(new Runnable() {
                /* class com.bytedance.analytics.p124a.GestureDetector$OnGestureListenerC2589g.RunnableC25912 */

                static {
                    Covode.recordClassIndex(2978);
                }

                public final void run() {
                    C2581b.m7530a();
                }
            }, (long) C2580a.f7781d);
        } else if (action != 2 || ((Math.abs(motionEvent.getX() - this.f7803b) <= 20.0f && Math.abs(motionEvent.getY() - this.f7804c) <= 20.0f) || System.currentTimeMillis() - C2581b.f7786b < ((long) C2580a.f7781d))) {
            return dispatchTouchEvent;
        } else {
            C2581b.m7530a();
        }
        return dispatchTouchEvent;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (System.currentTimeMillis() - C2581b.f7786b < ((long) C2580a.f7781d)) {
            return false;
        }
        C2594b.m7541a("**** TraceRootGroupLayout onScroll ****");
        C2581b.m7530a();
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(5788);
        C2594b.m7541a("**** TraceRootGroupLayout onLayout ****");
        super.onLayout(z, i, i2, i3, i4);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - C2581b.f7786b < ((long) C2580a.f7781d)) {
            MethodCollector.m26664o(5788);
            return;
        }
        C2581b.f7786b = currentTimeMillis;
        postDelayed(new Runnable() {
            /* class com.bytedance.analytics.p124a.GestureDetector$OnGestureListenerC2589g.RunnableC25901 */

            static {
                Covode.recordClassIndex(2977);
            }

            public final void run() {
                C2581b.m7530a();
            }
        }, (long) C2580a.f7781d);
        MethodCollector.m26664o(5788);
    }
}
