package com.p2082ss.android.ugc.aweme.following.p3003ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.NestedVPScrollView */
public final class NestedVPScrollView extends NestedScrollView {

    /* renamed from: d */
    private float f117985d = -1.0f;

    /* renamed from: e */
    private float f117986e = -1.0f;

    static {
        Covode.recordClassIndex(60343);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                if (Math.abs(rawX - this.f117985d) + 0.0f >= Math.abs(rawY - this.f117986e) + 0.0f) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f117985d = rawX;
                this.f117986e = rawY;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedVPScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
    }
}
