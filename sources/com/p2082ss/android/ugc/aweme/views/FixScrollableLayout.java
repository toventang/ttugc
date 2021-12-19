package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74707c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.views.FixScrollableLayout */
public final class FixScrollableLayout extends ScrollableLayout {
    static {
        Covode.recordClassIndex(94754);
    }

    public FixScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (C74707c.f167915c.mo117722b() && motionEvent.getAction() == 0) {
            requestDisallowInterceptTouchEvent(true);
        }
        return dispatchTouchEvent;
    }

    private /* synthetic */ FixScrollableLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FixScrollableLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
