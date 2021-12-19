package com.p2082ss.android.p2092ad.splash.core.p2105j;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ad.splash.core.j.e */
public final class C29534e extends MetricAffectingSpan {

    /* renamed from: a */
    private int f70366a;

    static {
        Covode.recordClassIndex(35928);
    }

    public C29534e(int i) {
        this.f70366a = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += this.f70366a;
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += this.f70366a;
    }
}
