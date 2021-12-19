package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.widget.j */
public class C11429j extends GestureDetector {

    /* renamed from: a */
    private final C11431l f27399a;

    static {
        Covode.recordClassIndex(13085);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 1 || !this.f27399a.mo13849a(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11429j(Context context, C11431l lVar) {
        super(context, lVar);
        C89219l.m154721d(lVar, "");
        this.f27399a = lVar;
    }
}
