package com.p2082ss.android.ugc.aweme.utils;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.utils.k */
public final /* synthetic */ class View$OnTouchListenerC80598k implements View.OnTouchListener {

    /* renamed from: a */
    private final View f180221a;

    /* renamed from: b */
    private final float f180222b = 0.75f;

    /* renamed from: c */
    private final float f180223c;

    static {
        Covode.recordClassIndex(93871);
    }

    View$OnTouchListenerC80598k(View view, float f) {
        this.f180221a = view;
        this.f180223c = f;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = this.f180221a;
        float f = this.f180222b;
        float f2 = this.f180223c;
        int action = motionEvent.getAction();
        if (action == 0) {
            view2.animate().alpha(f).setDuration(150).start();
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            view2.animate().alpha(f2).setDuration(150).start();
            return false;
        }
    }
}
