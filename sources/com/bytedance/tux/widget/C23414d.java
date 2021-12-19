package com.bytedance.tux.widget;

import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.widget.d */
public final class C23414d extends FrameLayout {

    /* renamed from: a */
    private boolean f55517a;

    /* renamed from: b */
    private boolean f55518b;

    static {
        Covode.recordClassIndex(27373);
    }

    public final boolean getRemoveBottomInsets() {
        return this.f55518b;
    }

    public final boolean getRemoveTopInsets() {
        return this.f55517a;
    }

    public final void setRemoveBottomInsets(boolean z) {
        this.f55518b = z;
    }

    public final void setRemoveTopInsets(boolean z) {
        this.f55517a = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C23414d(Context context) {
        super(context, null, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(11104);
        MethodCollector.m26664o(11104);
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        if (this.f55517a && rect != null) {
            rect.top = 0;
        }
        if (this.f55518b && rect != null) {
            rect.bottom = 0;
        }
        return super.fitSystemWindows(rect);
    }

    public /* synthetic */ C23414d(Context context, byte b) {
        this(context);
    }
}
