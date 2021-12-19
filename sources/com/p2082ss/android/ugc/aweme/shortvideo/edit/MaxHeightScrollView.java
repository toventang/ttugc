package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.MaxHeightScrollView */
public final class MaxHeightScrollView extends ScrollView {

    /* renamed from: a */
    private int f158456a;

    static {
        Covode.recordClassIndex(83253);
    }

    public final void setMaxHeightDp(int i) {
        this.f158456a = i;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(11604);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C71812ep.m126783a((double) this.f158456a, C63247i.f143610a), Integer.MIN_VALUE));
        MethodCollector.m26664o(11604);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(11605);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.a53, R.attr.a54, R.attr.aat}, 0, 0);
        C89219l.m154716b(obtainStyledAttributes, "");
        try {
            this.f158456a = obtainStyledAttributes.getInteger(1, 0);
        } finally {
            obtainStyledAttributes.recycle();
            MethodCollector.m26664o(11605);
        }
    }
}
