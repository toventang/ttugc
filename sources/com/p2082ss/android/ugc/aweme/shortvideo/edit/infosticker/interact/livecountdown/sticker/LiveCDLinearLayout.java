package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDLinearLayout */
public final class LiveCDLinearLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f159568a;

    static {
        Covode.recordClassIndex(83722);
    }

    public final void setMode(boolean z) {
        this.f159568a = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f159568a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public LiveCDLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10118);
        MethodCollector.m26664o(10118);
    }
}
