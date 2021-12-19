package com.p2082ss.android.ugc.aweme.question.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.widget.MonitorSizeChangedLinearLayout */
public final class MonitorSizeChangedLinearLayout extends LinearLayout {

    /* renamed from: a */
    private AbstractC89188r<? super Integer, ? super Integer, ? super Integer, ? super Integer, C89391z> f149695a;

    static {
        Covode.recordClassIndex(78128);
    }

    public MonitorSizeChangedLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setOnSizeChangedListener(AbstractC89188r<? super Integer, ? super Integer, ? super Integer, ? super Integer, C89391z> rVar) {
        this.f149695a = rVar;
    }

    private /* synthetic */ MonitorSizeChangedLinearLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MonitorSizeChangedLinearLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11189);
        MethodCollector.m26664o(11189);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        AbstractC89188r<? super Integer, ? super Integer, ? super Integer, ? super Integer, C89391z> rVar = this.f149695a;
        if (rVar != null) {
            rVar.mo8774a(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }
}
