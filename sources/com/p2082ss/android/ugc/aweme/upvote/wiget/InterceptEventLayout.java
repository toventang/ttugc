package com.p2082ss.android.ugc.aweme.upvote.wiget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.wiget.InterceptEventLayout */
public final class InterceptEventLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f179350a;

    static {
        Covode.recordClassIndex(93266);
    }

    public InterceptEventLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setInterceptTouchEvent(boolean z) {
        this.f179350a = z;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f179350a) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private /* synthetic */ InterceptEventLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InterceptEventLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7530);
        MethodCollector.m26664o(7530);
    }
}
