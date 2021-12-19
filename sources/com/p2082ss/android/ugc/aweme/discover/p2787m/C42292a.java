package com.p2082ss.android.ugc.aweme.discover.p2787m;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.m.a */
public final class C42292a extends MetricAffectingSpan {

    /* renamed from: a */
    public Typeface f98524a;

    static {
        Covode.recordClassIndex(50235);
    }

    public C42292a(Typeface typeface) {
        this.f98524a = typeface;
    }

    /* renamed from: a */
    private final void m84655a(Paint paint) {
        Typeface typeface = this.f98524a;
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        C89219l.m154721d(textPaint, "");
        m84655a(textPaint);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        C89219l.m154721d(textPaint, "");
        m84655a(textPaint);
    }
}
