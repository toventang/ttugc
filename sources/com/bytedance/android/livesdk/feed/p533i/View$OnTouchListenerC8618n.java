package com.bytedance.android.livesdk.feed.p533i;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.i.n */
public final /* synthetic */ class View$OnTouchListenerC8618n implements View.OnTouchListener {

    /* renamed from: a */
    private final C8614m f21313a;

    static {
        Covode.recordClassIndex(9475);
    }

    View$OnTouchListenerC8618n(C8614m mVar) {
        this.f21313a = mVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C8614m mVar = this.f21313a;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            mVar.f21301a.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        mVar.f21301a.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
