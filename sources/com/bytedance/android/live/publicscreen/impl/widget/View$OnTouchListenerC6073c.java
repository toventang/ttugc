package com.bytedance.android.live.publicscreen.impl.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.c */
final /* synthetic */ class View$OnTouchListenerC6073c implements View.OnTouchListener {

    /* renamed from: a */
    private final PublicScreenWidget f15211a;

    static {
        Covode.recordClassIndex(6690);
    }

    View$OnTouchListenerC6073c(PublicScreenWidget publicScreenWidget) {
        this.f15211a = publicScreenWidget;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f15211a.mo11923a(motionEvent);
    }
}
