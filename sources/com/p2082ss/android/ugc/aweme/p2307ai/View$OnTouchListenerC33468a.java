package com.p2082ss.android.ugc.aweme.p2307ai;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ai.a */
public final class View$OnTouchListenerC33468a implements View.OnTouchListener {

    /* renamed from: a */
    public View.OnTouchListener f79525a = null;

    /* renamed from: b */
    private final float f79526b;

    /* renamed from: c */
    private final long f79527c = 150;

    static {
        Covode.recordClassIndex(40325);
    }

    public View$OnTouchListenerC33468a(float f) {
        this.f79526b = f;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.animate().alpha(this.f79526b).setDuration(this.f79527c).start();
        } else if (action == 1 || action == 3) {
            view.animate().alpha(1.0f).setDuration(this.f79527c).start();
        }
        View.OnTouchListener onTouchListener = this.f79525a;
        if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }
}
