package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.lynx.tasm.behavior.shadow.text.d */
public final class C28554d extends MetricAffectingSpan {

    /* renamed from: a */
    private final int f67183a;

    /* renamed from: b */
    private final int f67184b;

    static {
        Covode.recordClassIndex(34570);
    }

    /* renamed from: a */
    private int m57128a() {
        int i = this.f67184b;
        if (i == 1) {
            return 700;
        }
        if (i == 0) {
            return 400;
        }
        return (i - 1) * 100;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f67183a), Integer.valueOf(this.f67184b));
    }

    public final void updateDrawState(TextPaint textPaint) {
        m57129a(textPaint);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        m57129a(textPaint);
    }

    /* renamed from: a */
    private void m57129a(TextPaint textPaint) {
        boolean z;
        Typeface typeface = textPaint.getTypeface();
        int a = m57128a();
        if (this.f67183a == 2) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setTypeface(Typeface.create(typeface, a, z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C28554d dVar = (C28554d) obj;
            if (this.f67183a == dVar.f67183a && this.f67184b == dVar.f67184b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C28554d(int i, int i2) {
        this.f67183a = i;
        this.f67184b = i2;
    }
}
