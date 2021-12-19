package com.p2082ss.android.ugc.aweme.comment;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.d */
public final /* synthetic */ class View$OnTouchListenerC36400d implements View.OnTouchListener {

    /* renamed from: a */
    private final C36274b f86088a;

    /* renamed from: b */
    private final String f86089b;

    /* renamed from: c */
    private final String f86090c;

    static {
        Covode.recordClassIndex(43695);
    }

    View$OnTouchListenerC36400d(C36274b bVar, String str, String str2) {
        this.f86088a = bVar;
        this.f86089b = str;
        this.f86090c = str2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f86088a.mo63488a(this.f86089b, this.f86090c, view, motionEvent);
    }
}
