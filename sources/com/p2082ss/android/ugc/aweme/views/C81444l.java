package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.views.l */
public final class C81444l extends HorizontalScrollView {

    /* renamed from: a */
    private boolean f182035a = true;

    static {
        Covode.recordClassIndex(94813);
    }

    public final void setScrollable(boolean z) {
        this.f182035a = z;
    }

    public C81444l(Context context) {
        super(context);
        MethodCollector.m26663i(12377);
        MethodCollector.m26664o(12377);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f182035a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
