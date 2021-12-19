package com.p2082ss.android.ugc.tools.view.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tools.view.widget.f */
public final class View$OnTouchListenerC85048f implements View.OnTouchListener {

    /* renamed from: a */
    public View.OnTouchListener f190327a = null;

    /* renamed from: b */
    private final float f190328b = 0.5f;

    /* renamed from: c */
    private final long f190329c = 200;

    static {
        Covode.recordClassIndex(99069);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.animate().alpha(this.f190328b).setDuration(this.f190329c).start();
        } else if (action == 1 || action == 3) {
            view.animate().alpha(1.0f).setDuration(this.f190329c).start();
        }
        View.OnTouchListener onTouchListener = this.f190327a;
        if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }
}
