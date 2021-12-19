package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollEditText */
public class PollEditText extends DmtEditText {

    /* renamed from: a */
    public long f159594a;

    /* renamed from: b */
    private boolean f159595b;

    static {
        Covode.recordClassIndex(83734);
    }

    public void setMode(boolean z) {
        this.f159595b = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f159595b) {
            return super.onTouchEvent(motionEvent);
        }
        this.f159594a = System.currentTimeMillis();
        return false;
    }

    public PollEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
