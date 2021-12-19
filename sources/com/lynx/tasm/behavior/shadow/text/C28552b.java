package com.lynx.tasm.behavior.shadow.text;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.shadow.text.b */
public class C28552b extends MetricAffectingSpan {

    /* renamed from: a */
    private final float f67180a;

    static {
        Covode.recordClassIndex(34568);
    }

    public void updateDrawState(TextPaint textPaint) {
        m57127a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m57127a(textPaint);
    }

    public C28552b(float f) {
        this.f67180a = f;
    }

    /* renamed from: a */
    private void m57127a(TextPaint textPaint) {
        if (!Float.isNaN(this.f67180a)) {
            textPaint.setLetterSpacing(this.f67180a / textPaint.getTextSize());
        }
    }
}
