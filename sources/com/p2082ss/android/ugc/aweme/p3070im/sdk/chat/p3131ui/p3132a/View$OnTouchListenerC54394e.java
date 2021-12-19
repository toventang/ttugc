package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.e */
public final /* synthetic */ class View$OnTouchListenerC54394e implements View.OnTouchListener {

    /* renamed from: a */
    private final AbstractC54386c f124608a;

    static {
        Covode.recordClassIndex(64097);
    }

    View$OnTouchListenerC54394e(AbstractC54386c cVar) {
        this.f124608a = cVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC54386c cVar = this.f124608a;
        if (motionEvent == null || motionEvent.getAction() != 0) {
            return false;
        }
        cVar.f124588r = (int) motionEvent.getX();
        cVar.f124589s = (int) motionEvent.getY();
        return false;
    }
}
