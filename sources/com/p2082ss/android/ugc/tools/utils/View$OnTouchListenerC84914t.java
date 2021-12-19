package com.p2082ss.android.ugc.tools.utils;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.tools.utils.t */
public final /* synthetic */ class View$OnTouchListenerC84914t implements View.OnTouchListener {

    /* renamed from: a */
    private final View f189750a;

    /* renamed from: b */
    private final float f189751b;

    static {
        Covode.recordClassIndex(98908);
    }

    View$OnTouchListenerC84914t(View view, float f) {
        this.f189750a = view;
        this.f189751b = f;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = this.f189750a;
        float f = this.f189751b;
        if (motionEvent.getAction() == 0) {
            C84913s.m145937a(view2, 1.0f, f);
            return false;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            C84913s.m145937a(view2, f, 1.0f);
            return false;
        }
    }
}
