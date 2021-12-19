package com.p2082ss.android.ugc.aweme.p2307ai;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ai.d */
public final class View$OnTouchListenerC33472d implements View.OnTouchListener {

    /* renamed from: a */
    private final float f79535a = 1.2f;

    /* renamed from: b */
    private final long f79536b = 100;

    /* renamed from: c */
    private final View.OnTouchListener f79537c = null;

    static {
        Covode.recordClassIndex(40329);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.animate().scaleX(this.f79535a).scaleY(this.f79535a).setDuration(this.f79536b).start();
        } else if (action == 1 || action == 3) {
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f79536b).start();
        }
        View.OnTouchListener onTouchListener = this.f79537c;
        if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }
}
