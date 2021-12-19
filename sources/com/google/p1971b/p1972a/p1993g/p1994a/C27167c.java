package com.google.p1971b.p1972a.p1993g.p1994a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.b.a.g.a.c */
public final class C27167c extends AbstractC27170e {

    /* renamed from: a */
    private static final char[] f64313a = {'+'};

    /* renamed from: b */
    private static final char[] f64314b = "0123456789ABCDEF".toCharArray();

    /* renamed from: c */
    private final boolean f64315c;

    /* renamed from: d */
    private final boolean[] f64316d;

    static {
        Covode.recordClassIndex(32747);
    }

    @Override // com.google.p1971b.p1972a.p1993g.p1994a.AbstractC27166b
    /* renamed from: a */
    public final String mo45238a(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.f64316d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return mo45242a(str, i);
            }
        }
        return str;
    }

    /* renamed from: b */
    private static boolean[] m53997b(String str) {
        char[] charArray = str.toCharArray();
        int i = 122;
        for (char c : charArray) {
            i = Math.max((int) c, i);
        }
        boolean[] zArr = new boolean[(i + 1)];
        int i2 = 48;
        do {
            zArr[i2] = true;
            i2++;
        } while (i2 <= 57);
        int i3 = 65;
        do {
            zArr[i3] = true;
            i3++;
        } while (i3 <= 90);
        int i4 = 97;
        do {
            zArr[i4] = true;
            i4++;
        } while (i4 <= 122);
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.p1971b.p1972a.p1993g.p1994a.AbstractC27170e
    /* renamed from: a */
    public final char[] mo45240a(int i) {
        boolean[] zArr = this.f64316d;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32 && this.f64315c) {
            return f64313a;
        }
        if (i <= 127) {
            char[] cArr = new char[3];
            cArr[0] = '%';
            char[] cArr2 = f64314b;
            cArr[2] = cArr2[i & 15];
            cArr[1] = cArr2[i >>> 4];
            return cArr;
        } else if (i <= 2047) {
            char[] cArr3 = new char[6];
            cArr3[0] = '%';
            cArr3[3] = '%';
            char[] cArr4 = f64314b;
            cArr3[5] = cArr4[i & 15];
            int i2 = i >>> 4;
            cArr3[4] = cArr4[(i2 & 3) | 8];
            int i3 = i2 >>> 2;
            cArr3[2] = cArr4[i3 & 15];
            cArr3[1] = cArr4[(i3 >>> 4) | 12];
            return cArr3;
        } else if (i <= 65535) {
            char[] cArr5 = new char[9];
            cArr5[0] = '%';
            cArr5[1] = 'E';
            cArr5[3] = '%';
            cArr5[6] = '%';
            char[] cArr6 = f64314b;
            cArr5[8] = cArr6[i & 15];
            int i4 = i >>> 4;
            cArr5[7] = cArr6[(i4 & 3) | 8];
            int i5 = i4 >>> 2;
            cArr5[5] = cArr6[i5 & 15];
            int i6 = i5 >>> 4;
            cArr5[4] = cArr6[(i6 & 3) | 8];
            cArr5[2] = cArr6[i6 >>> 2];
            return cArr5;
        } else if (i <= 1114111) {
            char[] cArr7 = new char[12];
            cArr7[0] = '%';
            cArr7[1] = 'F';
            cArr7[3] = '%';
            cArr7[6] = '%';
            cArr7[9] = '%';
            char[] cArr8 = f64314b;
            cArr7[11] = cArr8[i & 15];
            int i7 = i >>> 4;
            cArr7[10] = cArr8[(i7 & 3) | 8];
            int i8 = i7 >>> 2;
            cArr7[8] = cArr8[i8 & 15];
            int i9 = i8 >>> 4;
            cArr7[7] = cArr8[(i9 & 3) | 8];
            int i10 = i9 >>> 2;
            cArr7[5] = cArr8[i10 & 15];
            int i11 = i10 >>> 4;
            cArr7[4] = cArr8[(i11 & 3) | 8];
            cArr7[2] = cArr8[(i11 >>> 2) & 7];
            return cArr7;
        } else {
            throw new IllegalArgumentException(new StringBuilder(43).append("Invalid unicode character value ").append(i).toString());
        }
    }

    public C27167c(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        } else if (z && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        } else if (!str.contains("%")) {
            this.f64315c = z;
            this.f64316d = m53997b(str);
        } else {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.p1971b.p1972a.p1993g.p1994a.AbstractC27170e
    /* renamed from: a */
    public final int mo45239a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.f64316d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }
}
