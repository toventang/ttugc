package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.ga */
public final class C26403ga {
    static {
        Covode.recordClassIndex(31825);
    }

    /* renamed from: a */
    private static Object m51973a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m51975a(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    /* renamed from: a */
    public static <T> T m51974a(Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = (T) m51973a(bundle, str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(C1764a.m5928a("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t2.getClass().getCanonicalName()}));
    }
}
