package com.p2082ss.android.ugc.aweme.base.utils;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.base.utils.p */
public final /* synthetic */ class View$OnTouchListenerC34732p implements View.OnTouchListener {

    /* renamed from: a */
    public static final View.OnTouchListener f82022a = new View$OnTouchListenerC34732p();

    static {
        Covode.recordClassIndex(41724);
    }

    private View$OnTouchListenerC34732p() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setScaleX(0.8f);
            view.setScaleY(0.8f);
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(40).start();
            return false;
        }
    }
}
