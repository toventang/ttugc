package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.AVEditText;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDEditText */
public final class LiveCDEditText extends AVEditText {

    /* renamed from: a */
    private boolean f159567a;

    static {
        Covode.recordClassIndex(83721);
    }

    public final void setMode(boolean z) {
        this.f159567a = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f159567a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public LiveCDEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
