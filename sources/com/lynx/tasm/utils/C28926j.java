package com.lynx.tasm.utils;

import android.util.TypedValue;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.utils.j */
public class C28926j {
    static {
        Covode.recordClassIndex(35054);
    }

    /* renamed from: c */
    public static float m57940c(float f) {
        return f / DisplayMetricsHolder.m57911a().density;
    }

    /* renamed from: a */
    public static float m57938a(float f) {
        return TypedValue.applyDimension(1, f, DisplayMetricsHolder.m57911a());
    }

    /* renamed from: b */
    public static float m57939b(float f) {
        return TypedValue.applyDimension(2, f, DisplayMetricsHolder.m57911a());
    }
}
