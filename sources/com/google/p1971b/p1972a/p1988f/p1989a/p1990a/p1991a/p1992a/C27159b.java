package com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.google.b.a.f.a.a.a.a.b */
public final class C27159b {
    static {
        Covode.recordClassIndex(32739);
    }

    /* renamed from: a */
    public static <T> T m53980a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    public static void m53983a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static <T> T m53981a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static void m53984a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static String m53982a(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m53985a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m53982a(str, objArr));
        }
    }
}
