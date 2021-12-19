package androidx.p025c;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.c.c */
public final class C0488c {

    /* renamed from: a */
    static final int[] f1849a = new int[0];

    /* renamed from: b */
    static final long[] f1850b = new long[0];

    /* renamed from: c */
    static final Object[] f1851c = new Object[0];

    /* renamed from: c */
    private static int m1753c(int i) {
        int i2 = 4;
        do {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
            i2++;
        } while (i2 < 32);
        return i;
    }

    static {
        Covode.recordClassIndex(554);
    }

    /* renamed from: a */
    public static int m1748a(int i) {
        return m1753c(i * 4) / 4;
    }

    /* renamed from: b */
    public static int m1752b(int i) {
        return m1753c(i * 8) / 8;
    }

    /* renamed from: a */
    public static boolean m1751a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static int m1749a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ -1;
    }

    /* renamed from: a */
    static int m1750a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }
}
