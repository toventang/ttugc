package com.lynx.tasm.behavior.shadow.text;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;

/* renamed from: com.lynx.tasm.behavior.shadow.text.j */
public final class C28560j {
    static {
        Covode.recordClassIndex(34576);
    }

    /* renamed from: a */
    public static StaticLayout m57130a(CharSequence charSequence, int i, TextPaint textPaint, int i2, Layout.Alignment alignment, float f, boolean z, TextUtils.TruncateAt truncateAt, int i3, TextDirectionHeuristic textDirectionHeuristic) {
        int i4 = i3;
        if (i4 == -1 && textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, 1.0f, f, z);
        }
        try {
            Constructor constructor = StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
            Object[] objArr = new Object[13];
            objArr[0] = charSequence;
            objArr[1] = 0;
            objArr[2] = Integer.valueOf(i);
            objArr[3] = textPaint;
            objArr[4] = Integer.valueOf(i2);
            objArr[5] = alignment;
            objArr[6] = textDirectionHeuristic;
            objArr[7] = Float.valueOf(1.0f);
            objArr[8] = Float.valueOf(f);
            objArr[9] = Boolean.valueOf(z);
            objArr[10] = truncateAt;
            objArr[11] = Integer.valueOf(i2);
            if (i4 == -1) {
                i4 = Integer.MAX_VALUE;
            }
            objArr[12] = Integer.valueOf(i4);
            return (StaticLayout) constructor.newInstance(objArr);
        } catch (Throwable unused) {
            return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, 1.0f, f, z);
        }
    }
}
