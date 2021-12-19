package com.p2082ss.android.ugc.aweme.sticker;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.t */
public final class View$OnTouchListenerC75885t implements View.OnTouchListener {

    /* renamed from: a */
    public final long f170456a;

    /* renamed from: b */
    private final float f170457b;

    /* renamed from: c */
    private final View f170458c;

    static {
        Covode.recordClassIndex(88823);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f170458c.animate().scaleX(this.f170457b).scaleY(this.f170457b).setDuration(this.f170456a).start();
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            this.f170458c.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f170456a).start();
            return false;
        }
    }

    public View$OnTouchListenerC75885t(float f, long j, View view) {
        C89219l.m154721d(view, "");
        this.f170457b = f;
        this.f170456a = j;
        this.f170458c = view;
    }
}
