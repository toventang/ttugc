package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.de */
public final class C25889de {
    static {
        Covode.recordClassIndex(31304);
    }

    /* renamed from: a */
    static int m50102a(int i, int i2, int i3) {
        return (i & (i3 ^ -1)) | (i2 & i3);
    }

    /* renamed from: b */
    static int m50107b(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: a */
    static Object m50105a(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(new StringBuilder(52).append("must be power of 2 between 2^1 and 2^30: ").append(i).toString());
        } else if (i <= 256) {
            return new byte[i];
        } else {
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
    }

    /* renamed from: a */
    static int m50103a(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: a */
    static void m50106a(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* renamed from: a */
    static int m50104a(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int a = C25891dg.m50109a(obj);
        int i4 = a & i;
        int a2 = m50103a(obj3, i4);
        if (a2 == 0) {
            return -1;
        }
        int i5 = i ^ -1;
        int i6 = a & i5;
        int i7 = -1;
        while (true) {
            i2 = a2 - 1;
            i3 = iArr[i2];
            if ((i3 & i5) != i6 || !C25865ch.m50063a(obj, objArr[i2]) || (objArr2 != null && !C25865ch.m50063a(obj2, objArr2[i2]))) {
                a2 = i3 & i;
                if (a2 == 0) {
                    return -1;
                }
                i7 = i2;
            }
        }
        int i8 = i3 & i;
        if (i7 == -1) {
            m50106a(obj3, i4, i8);
        } else {
            iArr[i7] = m50102a(iArr[i7], i8, i);
        }
        return i2;
    }
}
