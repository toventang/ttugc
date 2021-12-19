package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.j */
final /* synthetic */ class View$OnTouchListenerC78967j implements View.OnTouchListener {

    /* renamed from: a */
    private final MvTemplateView f177479a;

    static {
        Covode.recordClassIndex(92116);
    }

    View$OnTouchListenerC78967j(MvTemplateView mvTemplateView) {
        this.f177479a = mvTemplateView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f177479a.f177161n.dispatchTouchEvent(motionEvent);
    }
}
