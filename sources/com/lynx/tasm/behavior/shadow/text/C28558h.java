package com.lynx.tasm.behavior.shadow.text;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.shadow.text.h */
public class C28558h extends MetricAffectingSpan {

    /* renamed from: a */
    public final int f67189a;

    static {
        Covode.recordClassIndex(34574);
    }

    public void updateMeasureState(TextPaint textPaint) {
    }

    public int hashCode() {
        return this.f67189a + 31;
    }

    public C28558h(int i) {
        this.f67189a = i;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f67189a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C28558h) || this.f67189a != ((C28558h) obj).f67189a) {
            return false;
        }
        return true;
    }
}
