package com.bytedance.p802b.p841k;

import android.os.Build;
import android.os.Trace;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.b.k.j */
public final class C13134j {
    static {
        Covode.recordClassIndex(14970);
    }

    /* renamed from: a */
    public static void m23620a() {
        if (C13113a.f31954f) {
            int i = Build.VERSION.SDK_INT;
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m23621a(String str) {
        if (C13113a.f31954f) {
            int i = Build.VERSION.SDK_INT;
            Trace.beginSection(str);
        }
    }
}
