package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.eu */
final class C25933eu {

    /* renamed from: a */
    static final Class<?> f61083a = m50184a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f61084b;

    /* renamed from: a */
    static boolean m50185a() {
        if (f61083a == null || f61084b) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        Covode.recordClassIndex(31348);
        if (m50184a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f61084b = z;
    }

    /* renamed from: a */
    private static <T> Class<T> m50184a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
