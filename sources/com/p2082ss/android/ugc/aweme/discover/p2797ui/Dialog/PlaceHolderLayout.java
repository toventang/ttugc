package com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.PlaceHolderLayout */
public final class PlaceHolderLayout extends FrameLayout {
    static {
        Covode.recordClassIndex(50633);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaceHolderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6785);
        MethodCollector.m26664o(6785);
    }
}
