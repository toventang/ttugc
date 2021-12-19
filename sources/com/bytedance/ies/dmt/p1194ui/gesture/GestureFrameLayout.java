package com.bytedance.ies.dmt.p1194ui.gesture;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.gesture.p1201a.AbstractC17243a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.dmt.ui.gesture.GestureFrameLayout */
public final class GestureFrameLayout extends FrameLayout {

    /* renamed from: a */
    private AbstractC17243a f41182a;

    static {
        Covode.recordClassIndex(19705);
    }

    public GestureFrameLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public GestureFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        AbstractC17243a aVar = this.f41182a;
        if (aVar != null) {
            return aVar.mo27281a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private GestureFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12161);
        MethodCollector.m26664o(12161);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ GestureFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
