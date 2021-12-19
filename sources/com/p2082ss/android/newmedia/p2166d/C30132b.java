package com.p2082ss.android.newmedia.p2166d;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.newmedia.d.b */
public final class C30132b {
    static {
        Covode.recordClassIndex(36631);
    }

    /* renamed from: a */
    private static Bundle m60953a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Object m60954a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m60952a(Intent intent, String str) {
        Object a;
        Bundle a2 = m60953a(intent);
        if (a2 == null || (a = m60954a(a2, str)) == null) {
            return -1;
        }
        if (a instanceof String) {
            try {
                return Integer.parseInt((String) a);
            } catch (NumberFormatException unused) {
                return -1;
            }
        } else {
            try {
                return ((Integer) a).intValue();
            } catch (ClassCastException unused2) {
                return -1;
            }
        }
    }

    /* renamed from: b */
    public static boolean m60955b(Intent intent, String str) {
        Object a;
        Bundle a2 = m60953a(intent);
        if (a2 == null || (a = m60954a(a2, str)) == null) {
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
}
