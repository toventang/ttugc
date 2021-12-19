package com.p2082ss.android.push;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.push.a */
public final class C30194a {
    static {
        Covode.recordClassIndex(36698);
    }

    /* renamed from: a */
    private static Bundle m61071a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Object m61072a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m61073b(Intent intent, String str) {
        Object a;
        Bundle a2 = m61071a(intent);
        if (a2 == null || (a = m61072a(a2, str)) == null) {
            return false;
        }
        if (a instanceof String) {
            try {
                return Boolean.parseBoolean((String) a);
            } catch (NumberFormatException unused) {
                return false;
            }
        } else {
            try {
                return ((Boolean) a).booleanValue();
            } catch (ClassCastException unused2) {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static long m61070a(Intent intent, String str) {
        Object a;
        Bundle a2 = m61071a(intent);
        if (a2 == null || (a = m61072a(a2, str)) == null) {
            return -1;
        }
        if (a instanceof String) {
            try {
                return Long.parseLong((String) a);
            } catch (NumberFormatException unused) {
                return -1;
            }
        } else {
            try {
                return ((Long) a).longValue();
            } catch (ClassCastException unused2) {
                return -1;
            }
        }
    }

    /* renamed from: a */
    public static int m61069a(Intent intent, String str, int i) {
        Object a;
        Bundle a2 = m61071a(intent);
        if (a2 == null || (a = m61072a(a2, str)) == null) {
            return i;
        }
        if (a instanceof String) {
            try {
                return Integer.parseInt((String) a);
            } catch (NumberFormatException unused) {
                return i;
            }
        } else {
            try {
                return ((Integer) a).intValue();
            } catch (ClassCastException unused2) {
                return i;
            }
        }
    }
}
