package com.bytedance.android.livesdk.like;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.like.e */
public final /* synthetic */ class View$OnTouchListenerC9171e implements View.OnTouchListener {

    /* renamed from: a */
    private final GestureDetector f22338a;

    static {
        Covode.recordClassIndex(10078);
    }

    View$OnTouchListenerC9171e(GestureDetector gestureDetector) {
        this.f22338a = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f22338a.onTouchEvent(motionEvent);
    }
}
