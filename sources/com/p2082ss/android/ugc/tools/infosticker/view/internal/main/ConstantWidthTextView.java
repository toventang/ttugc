package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.ConstantWidthTextView */
public final class ConstantWidthTextView extends StyleTextView {
    static {
        Covode.recordClassIndex(98669);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstantWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public final void onMeasure(int i, int i2) {
        super.onMeasure(0, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }
}
