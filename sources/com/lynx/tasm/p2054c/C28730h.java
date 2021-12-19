package com.lynx.tasm.p2054c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.utils.DisplayMetricsHolder;

/* renamed from: com.lynx.tasm.c.h */
public final class C28730h extends C28725c {
    static {
        Covode.recordClassIndex(34824);
    }

    private C28730h(int i, String str) {
        super(i, str);
    }

    /* renamed from: a */
    public static C28730h m57546a(int i, String str) {
        return new C28730h(i, str);
    }

    /* renamed from: a */
    public final void mo49842a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (DisplayMetricsHolder.m57911a() != null) {
            mo49838a("scrollLeft", Float.valueOf(((float) i) / DisplayMetricsHolder.m57911a().density));
            mo49838a("scrollTop", Float.valueOf(((float) i2) / DisplayMetricsHolder.m57911a().density));
            mo49838a("scrollHeight", Float.valueOf(((float) i3) / DisplayMetricsHolder.m57911a().density));
            mo49838a("scrollWidth", Float.valueOf(((float) i4) / DisplayMetricsHolder.m57911a().density));
            mo49838a("deltaX", Float.valueOf(((float) i5) / DisplayMetricsHolder.m57911a().density));
            mo49838a("deltaY", Float.valueOf(((float) i6) / DisplayMetricsHolder.m57911a().density));
        }
    }
}
