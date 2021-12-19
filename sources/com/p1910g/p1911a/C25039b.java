package com.p1910g.p1911a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.g.a.b */
public final class C25039b {
    static {
        Covode.recordClassIndex(30402);
    }

    /* renamed from: a */
    public static boolean m48011a(String str) {
        try {
            Object[] a = C25038a.f59392a.mo40938a("checkPermission", str);
            if (a.length > 0) {
                return ((Boolean) a[0]).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static Object m48010a(int i, int i2, int i3) {
        try {
            Object[] a = C25038a.f59392a.mo40938a("turbo", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), null);
            if (a.length > 0) {
                return a[0];
            }
            return 1;
        } catch (Exception unused) {
            return 1;
        }
    }
}
