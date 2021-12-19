package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.view.TEIgnoreAbleFrameLayout */
public final class TEIgnoreAbleFrameLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f104089a;

    static {
        Covode.recordClassIndex(52998);
    }

    public final boolean getTouchEventDisable() {
        return this.f104089a;
    }

    public final void setTouchEventDisable(boolean z) {
        this.f104089a = z;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f104089a) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TEIgnoreAbleFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(7398);
        MethodCollector.m26664o(7398);
    }
}
