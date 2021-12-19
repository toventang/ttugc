package com.bytedance.ies.uikit.p1280b;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.uikit.b.c */
public final class C18245c extends FrameLayout {

    /* renamed from: a */
    private GestureDetector f43459a;

    /* renamed from: b */
    private AbstractC18246a f43460b;

    /* renamed from: c */
    private boolean f43461c;

    /* renamed from: d */
    private boolean f43462d;

    /* renamed from: e */
    private boolean f43463e;

    /* renamed from: com.bytedance.ies.uikit.b.c$a */
    public interface AbstractC18246a {
        static {
            Covode.recordClassIndex(20905);
        }
    }

    static {
        Covode.recordClassIndex(20904);
    }

    public final void setDisllowInterceptEnabled(boolean z) {
        this.f43462d = z;
    }

    public final void setOnSwipeListener(AbstractC18246a aVar) {
        this.f43460b = aVar;
    }

    public final void setSwipeEnabled(boolean z) {
        this.f43461c = z;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f43463e = z;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.f43463e = false;
            }
            if (this.f43463e && this.f43462d) {
                z = true;
            }
            if (!this.f43461c || (gestureDetector = this.f43459a) == null || z || !gestureDetector.onTouchEvent(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
