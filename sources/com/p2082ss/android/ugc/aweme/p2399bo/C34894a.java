package com.p2082ss.android.ugc.aweme.p2399bo;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.bo.a */
public final class C34894a {

    /* renamed from: a */
    public static final C34894a f82342a = new C34894a();

    /* renamed from: b */
    private static int m71273b(float f, int i) {
        return (int) ((f * ((float) i)) / 100.0f);
    }

    private C34894a() {
    }

    static {
        Covode.recordClassIndex(41905);
    }

    /* renamed from: a */
    public static int m71272a(int i) {
        if (i <= 0) {
            return 0;
        }
        return i / 1000;
    }

    /* renamed from: b */
    private static String m71274b(int i) {
        if (i < 10) {
            return "0".concat(String.valueOf(i));
        }
        return String.valueOf(i);
    }

    /* renamed from: a */
    public final CharSequence mo61797a(float f, int i) {
        boolean z;
        int b = m71273b(f, i);
        if (i >= 3600) {
            z = true;
        } else {
            z = false;
        }
        return mo61798a(b, z);
    }

    /* renamed from: a */
    public final String mo61798a(int i, boolean z) {
        if (i >= 3600) {
            return m71274b(i / 3600) + ':' + mo61798a(i % 3600, false);
        } else if (z) {
            return "00:" + m71274b(i / 60) + ':' + m71274b(i % 60);
        } else {
            return m71274b(i / 60) + ':' + m71274b(i % 60);
        }
    }
}
