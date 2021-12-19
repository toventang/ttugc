package com.bytedance.android.livesdk.utils;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.utils.ai */
public final class View$OnTouchListenerC11219ai implements View.OnTouchListener {
    static {
        Covode.recordClassIndex(12847);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.setScaleX(0.96f);
            view.setScaleY(0.96f);
            view.setAlpha(0.64f);
            return false;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setAlpha(1.0f);
            return false;
        }
    }
}
