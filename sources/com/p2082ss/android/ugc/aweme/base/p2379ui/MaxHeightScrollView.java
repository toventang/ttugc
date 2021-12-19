package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.ui.MaxHeightScrollView */
public final class MaxHeightScrollView extends ScrollView {

    /* renamed from: a */
    private int f81884a;

    static {
        Covode.recordClassIndex(41637);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(12129);
        int i3 = this.f81884a;
        if (i3 <= 0) {
            super.onMeasure(i, i2);
            MethodCollector.m26664o(12129);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        MethodCollector.m26664o(12129);
    }

    private /* synthetic */ MaxHeightScrollView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MaxHeightScrollView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 16842880);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12130);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a53, R.attr.a54, R.attr.aat});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f81884a = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(12130);
    }
}
