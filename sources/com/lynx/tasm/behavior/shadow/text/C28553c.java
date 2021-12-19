package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.shadow.text.c */
public class C28553c implements LineHeightSpan {

    /* renamed from: a */
    private final int f67181a;

    /* renamed from: b */
    private final boolean f67182b;

    static {
        Covode.recordClassIndex(34569);
    }

    public int hashCode() {
        return this.f67181a + 31;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C28553c) || this.f67181a != ((C28553c) obj).f67181a) {
            return false;
        }
        return true;
    }

    public C28553c(float f, boolean z) {
        this.f67181a = (int) Math.ceil((double) f);
        this.f67182b = z;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f67182b) {
            int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
            int i6 = this.f67181a;
            int i7 = (i6 - i5) / 2;
            fontMetricsInt.ascent -= i7;
            fontMetricsInt.descent += (i6 - i7) - i5;
            return;
        }
        int i8 = fontMetricsInt.descent;
        int i9 = this.f67181a;
        if (i8 > i9) {
            int min = Math.min(i9, fontMetricsInt.descent);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.f67181a) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
            int i10 = (-this.f67181a) + fontMetricsInt.descent;
            fontMetricsInt.ascent = i10;
            fontMetricsInt.top = i10;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.f67181a) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.f67181a;
        } else {
            int i11 = (-fontMetricsInt.top) + fontMetricsInt.bottom;
            int i12 = this.f67181a;
            if (i11 > i12) {
                fontMetricsInt.top = fontMetricsInt.bottom - this.f67181a;
                return;
            }
            int round = Math.round(((float) (i12 - ((-fontMetricsInt.top) + fontMetricsInt.bottom))) / 2.0f);
            int round2 = Math.round(((float) (this.f67181a - (fontMetricsInt.descent - fontMetricsInt.ascent))) / 2.0f);
            fontMetricsInt.top -= round;
            fontMetricsInt.bottom += round;
            fontMetricsInt.ascent -= round2;
            fontMetricsInt.descent += round2;
        }
    }
}
