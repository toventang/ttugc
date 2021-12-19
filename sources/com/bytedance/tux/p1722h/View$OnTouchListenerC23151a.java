package com.bytedance.tux.p1722h;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.bytedance.tux.h.a */
public final class View$OnTouchListenerC23151a implements View.OnTouchListener {

    /* renamed from: a */
    private final float f54798a = 0.75f;

    /* renamed from: b */
    private final long f54799b = 50;

    /* renamed from: c */
    private final AbstractC89183m<View, MotionEvent, Boolean> f54800c = null;

    static {
        Covode.recordClassIndex(27080);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Boolean invoke;
        if (view == null || motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.animate().alpha(this.f54798a).setDuration(this.f54799b).start();
        } else if (action == 1 || action == 3) {
            view.animate().alpha(1.0f).setDuration(this.f54799b).start();
        }
        AbstractC89183m<View, MotionEvent, Boolean> mVar = this.f54800c;
        if (mVar == null || (invoke = mVar.invoke(view, motionEvent)) == null) {
            return false;
        }
        return invoke.booleanValue();
    }

    public View$OnTouchListenerC23151a(float f, long j, AbstractC89183m<? super View, ? super MotionEvent, Boolean> mVar) {
    }
}
