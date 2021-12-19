package com.bytedance.ies.dmt.p1194ui.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.widget.b */
public final class View$OnTouchListenerC17271b implements View.OnTouchListener {

    /* renamed from: a */
    private float f41340a = 0.5f;

    /* renamed from: b */
    private float f41341b = 1.0f;

    static {
        Covode.recordClassIndex(19749);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setAlpha(this.f41340a);
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            view.setAlpha(this.f41341b);
            return false;
        }
    }
}
