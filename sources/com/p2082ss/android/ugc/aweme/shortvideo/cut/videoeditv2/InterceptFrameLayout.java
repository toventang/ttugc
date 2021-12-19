package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.InterceptFrameLayout */
public final class InterceptFrameLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f157765a;

    static {
        Covode.recordClassIndex(83003);
    }

    public InterceptFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean getIntercept() {
        return this.f157765a;
    }

    public final void setIntercept(boolean z) {
        this.f157765a = z;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f157765a) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private /* synthetic */ InterceptFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InterceptFrameLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11971);
        MethodCollector.m26664o(11971);
    }
}
