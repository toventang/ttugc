package com.google.p1971b.p1972a.p1993g.p1994a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.b.a.g.a.e */
public abstract class AbstractC27170e extends AbstractC27166b {
    static {
        Covode.recordClassIndex(32750);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo45239a(CharSequence charSequence, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract char[] mo45240a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo45242a(String str, int i) {
        int length = str.length();
        char[] cArr = C27168d.f64317a.get();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            if (i < length) {
                int i4 = i + 1;
                char charAt = str.charAt(i);
                int i5 = 1;
                int i6 = charAt;
                if (charAt >= 55296) {
                    i6 = charAt;
                    if (charAt <= 57343) {
                        if (charAt > 56319) {
                            throw new IllegalArgumentException(new StringBuilder(82).append("Unexpected low surrogate character '").append(charAt).append("' with value ").append((int) charAt).append(" at index ").append(i4 - 1).toString());
                        } else if (i4 == length) {
                            i6 = -charAt;
                        } else {
                            char charAt2 = str.charAt(i4);
                            if (Character.isLowSurrogate(charAt2)) {
                                i6 = Character.toCodePoint(charAt, charAt2);
                            } else {
                                throw new IllegalArgumentException(new StringBuilder(83).append("Expected low surrogate but got char '").append(charAt2).append("' with value ").append((int) charAt2).append(" at index ").append(i4).toString());
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    char[] a = mo45240a(i6 == 1 ? 1 : 0);
                    if (Character.isSupplementaryCodePoint(i6)) {
                        i5 = 2;
                    }
                    int i7 = i5 + i;
                    if (a != null) {
                        int i8 = i - i2;
                        int i9 = i3 + i8;
                        int length2 = a.length + i9;
                        if (cArr.length < length2) {
                            cArr = m54001a(cArr, i3, ((length2 + length) - i) + 32);
                        }
                        if (i8 > 0) {
                            str.getChars(i2, i, cArr, i3);
                            i3 = i9;
                        }
                        if (a.length > 0) {
                            System.arraycopy(a, 0, cArr, i3, a.length);
                            i3 += a.length;
                        }
                        i2 = i7;
                    }
                    i = mo45239a(str, i7, length);
                } else {
                    throw new IllegalArgumentException("Trailing high surrogate at end of input");
                }
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i10 = length - i2;
        if (i10 > 0) {
            int i11 = i10 + i3;
            if (cArr.length < i11) {
                cArr = m54001a(cArr, i3, i11);
            }
            str.getChars(i2, length, cArr, i3);
            i3 = i11;
        }
        return new String(cArr, 0, i3);
    }

    /* renamed from: a */
    private static char[] m54001a(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
