package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.jj */
final class C26071jj {

    /* renamed from: a */
    static final AbstractC26073jl f61405a;

    /* renamed from: a */
    static int m51019a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    static int m51020a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: a */
    static int m51021a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static {
        AbstractC26073jl jkVar;
        Covode.recordClassIndex(31486);
        if (!C26065jh.f61381b || !C26065jh.f61380a || C25933eu.m50185a()) {
            jkVar = new C26072jk();
        } else {
            jkVar = new C26074jm();
        }
        f61405a = jkVar;
    }

    /* renamed from: a */
    static int m51022a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C26075jn(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException(new StringBuilder(54).append("UTF-8 length does not fit in int: ").append(((long) i3) + 4294967296L).toString());
    }

    /* renamed from: b */
    static String m51025b(byte[] bArr, int i, int i2) {
        return f61405a.mo42806b(bArr, i, i2);
    }

    /* renamed from: c */
    static /* synthetic */ int m51026c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m51019a(b);
        }
        if (i3 == 1) {
            return m51020a(b, bArr[i]);
        }
        if (i3 == 2) {
            return m51021a(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static boolean m51024a(byte[] bArr, int i, int i2) {
        return f61405a.mo42807c(bArr, i, i2);
    }

    /* renamed from: a */
    static int m51023a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f61405a.mo42804a(charSequence, bArr, i, i2);
    }
}
