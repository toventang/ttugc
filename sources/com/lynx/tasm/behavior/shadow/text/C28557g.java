package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.shadow.text.g */
public class C28557g extends MetricAffectingSpan {

    /* renamed from: a */
    private Typeface f67188a;

    static {
        Covode.recordClassIndex(34573);
    }

    public void updateMeasureState(TextPaint textPaint) {
    }

    public C28557g(Typeface typeface) {
        this.f67188a = typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        Typeface typeface = this.f67188a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }
}
