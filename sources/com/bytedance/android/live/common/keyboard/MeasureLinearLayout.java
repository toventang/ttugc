package com.bytedance.android.live.common.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class MeasureLinearLayout extends LinearLayout {

    /* renamed from: a */
    public C3811a f10536a;

    /* renamed from: b */
    private int f10537b;

    /* renamed from: c */
    private int f10538c;

    static {
        Covode.recordClassIndex(4337);
    }

    public C3811a getKeyBoardObservable() {
        return this.f10536a;
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(12304);
        int i3 = this.f10538c;
        int i4 = this.f10537b;
        if (i3 == i4) {
            this.f10536a.mo9156a(getContext(), i2);
        } else {
            this.f10538c = i4;
        }
        super.onMeasure(i, i2);
        MethodCollector.m26664o(12304);
    }

    private MeasureLinearLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(12303);
        this.f10536a = new C3811a();
        MethodCollector.m26664o(12303);
    }
}
