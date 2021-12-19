package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.views.WorkaroundNestedScrollView */
public final class WorkaroundNestedScrollView extends NestedScrollView {
    static {
        Covode.recordClassIndex(94790);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            computeScroll();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WorkaroundNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }
}
