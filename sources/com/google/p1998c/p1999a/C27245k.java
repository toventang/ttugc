package com.google.p1998c.p1999a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.google.c.a.k */
public final class C27245k {
    static {
        Covode.recordClassIndex(32825);
    }

    /* renamed from: a */
    public static void m54237a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(m54233a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public static void m54240a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m54233a(str, obj));
        }
    }

    /* renamed from: a */
    public static void m54239a(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m54233a(str, Long.valueOf(j), obj));
        }
    }

    /* renamed from: a */
    public static void m54241a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(m54233a(str, obj, obj2));
        }
    }

    /* renamed from: a */
    public static void m54238a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(m54233a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: a */
    public static <T> T m54229a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    public static void m54243b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m54235a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static <T> T m54230a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static int m54242b(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m54232a(i, i2, "index"));
    }

    /* renamed from: b */
    public static void m54244b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static int m54228a(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str = m54233a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: ".concat(String.valueOf(i2)));
        } else {
            str = m54233a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    /* renamed from: a */
    public static String m54233a(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) valueOf, i2, indexOf);
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) valueOf, i2, valueOf.length());
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
    public static void m54236a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static <T> T m54231a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(m54233a(str, objArr));
    }

    /* renamed from: a */
    private static String m54232a(int i, int i2, String str) {
        if (i < 0) {
            return m54233a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m54233a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: ".concat(String.valueOf(i2)));
        }
    }

    /* renamed from: b */
    public static void m54245b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(m54233a(str, obj));
        }
    }

    /* renamed from: a */
    public static void m54234a(int i, int i2, int i3) {
        String a;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                a = m54232a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                a = m54232a(i2, i3, "end index");
            } else {
                a = m54233a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(a);
        }
    }
}
