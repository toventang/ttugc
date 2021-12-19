package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.ci */
public final class C25866ci {
    static {
        Covode.recordClassIndex(31281);
    }

    /* renamed from: a */
    public static <T> T m50065a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    public static <T> T m50066a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static void m50071b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m50069a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m50070b(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m50067a(i, i2, "index"));
    }

    /* renamed from: a */
    public static int m50064a(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str = C25868ck.m50073a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
        } else {
            str = C25868ck.m50073a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    /* renamed from: a */
    public static void m50068a(int i, int i2, int i3) {
        String a;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                a = m50067a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                a = m50067a(i2, i3, "end index");
            } else {
                a = C25868ck.m50073a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(a);
        }
    }

    /* renamed from: a */
    private static String m50067a(int i, int i2, String str) {
        if (i < 0) {
            return C25868ck.m50073a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C25868ck.m50073a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
        }
    }
}
