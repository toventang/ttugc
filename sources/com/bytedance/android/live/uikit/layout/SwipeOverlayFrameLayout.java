package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

public class SwipeOverlayFrameLayout extends FrameLayout {

    /* renamed from: a */
    AbstractC6233a f15589a;

    /* renamed from: b */
    float f15590b;

    /* renamed from: c */
    float f15591c;

    /* renamed from: d */
    private GestureDetector f15592d;

    /* renamed from: e */
    private boolean f15593e = true;

    /* renamed from: f */
    private boolean f15594f;

    /* renamed from: g */
    private boolean f15595g;

    /* renamed from: com.bytedance.android.live.uikit.layout.SwipeOverlayFrameLayout$a */
    public interface AbstractC6233a {
        static {
            Covode.recordClassIndex(6941);
        }

        /* renamed from: a */
        boolean mo12204a();

        /* renamed from: b */
        boolean mo12205b();
    }

    static {
        Covode.recordClassIndex(6939);
    }

    public void setDisllowInterceptEnabled(boolean z) {
        this.f15594f = z;
    }

    public void setOnSwipeListener(AbstractC6233a aVar) {
        this.f15589a = aVar;
    }

    public void setSwipeEnabled(boolean z) {
        this.f15593e = z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f15595g = z;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.f15595g = false;
            }
            if (this.f15595g && this.f15594f) {
                z = true;
            }
            if (!this.f15593e || (gestureDetector = this.f15592d) == null || z || !gestureDetector.onTouchEvent(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11320);
        C62321 r3 = new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.android.live.uikit.layout.SwipeOverlayFrameLayout.C62321 */

            static {
                Covode.recordClassIndex(6940);
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                SwipeOverlayFrameLayout swipeOverlayFrameLayout = SwipeOverlayFrameLayout.this;
                if (swipeOverlayFrameLayout.f15589a == null || Math.abs(motionEvent2.getY() - motionEvent.getY()) > swipeOverlayFrameLayout.f15590b) {
                    return false;
                }
                float abs = Math.abs(f);
                float abs2 = Math.abs(f2);
                float abs3 = Math.abs(motionEvent2.getX() - motionEvent.getX());
                float abs4 = Math.abs(motionEvent2.getY() - motionEvent.getY());
                if (abs2 >= abs || abs4 >= abs3 || abs3 <= swipeOverlayFrameLayout.f15591c) {
                    return false;
                }
                if (f > 0.0f) {
                    return swipeOverlayFrameLayout.f15589a.mo12205b();
                }
                if (f < 0.0f) {
                    return swipeOverlayFrameLayout.f15589a.mo12204a();
                }
                return false;
            }
        };
        this.f15590b = C13628n.m24520b(context, 45.0f);
        this.f15591c = C13628n.m24520b(context, 65.0f);
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        GestureDetector gestureDetector = new GestureDetector(applicationContext, r3);
        this.f15592d = gestureDetector;
        gestureDetector.setOnDoubleTapListener(null);
        this.f15592d.setIsLongpressEnabled(false);
        MethodCollector.m26664o(11320);
    }
}
