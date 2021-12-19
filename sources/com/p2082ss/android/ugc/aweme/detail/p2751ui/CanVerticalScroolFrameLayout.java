package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.CanVerticalScroolFrameLayout */
public final class CanVerticalScroolFrameLayout extends FrameLayout {

    /* renamed from: a */
    private AbstractC89172b<? super Integer, Boolean> f96475a;

    static {
        Covode.recordClassIndex(49229);
    }

    public CanVerticalScroolFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Integer, java.lang.Boolean>, h.f.a.b<java.lang.Integer, java.lang.Boolean> */
    public final AbstractC89172b<Integer, Boolean> getChildListCanVerticalScrollCallback() {
        return this.f96475a;
    }

    public final void setChildListCanVerticalScrollCallback(AbstractC89172b<? super Integer, Boolean> bVar) {
        this.f96475a = bVar;
    }

    public final boolean canScrollVertically(int i) {
        AbstractC89172b<? super Integer, Boolean> bVar = this.f96475a;
        if (bVar == null) {
            return super.canScrollVertically(i);
        }
        Boolean invoke = bVar.invoke(Integer.valueOf(i));
        if (invoke != null) {
            return invoke.booleanValue();
        }
        return super.canScrollVertically(i);
    }

    private /* synthetic */ CanVerticalScroolFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CanVerticalScroolFrameLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10391);
        MethodCollector.m26664o(10391);
    }
}
