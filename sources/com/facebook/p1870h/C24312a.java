package com.facebook.p1870h;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24087g;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1840l.C24138c;
import com.facebook.p1870h.C24314c;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86745e;

/* renamed from: com.facebook.h.a */
public final class C24312a implements C24314c.AbstractC24315a {

    /* renamed from: b */
    private static final byte[] f57638b = {-1, -40, -1};

    /* renamed from: c */
    private static final int f57639c = 3;

    /* renamed from: d */
    private static final byte[] f57640d = {-119, 80, 78, 71, C86745e.f195623b, 10, 26, 10};

    /* renamed from: e */
    private static final int f57641e = 8;

    /* renamed from: f */
    private static final byte[] f57642f = C24317e.m46274a("GIF87a");

    /* renamed from: g */
    private static final byte[] f57643g = C24317e.m46274a("GIF89a");

    /* renamed from: h */
    private static final byte[] f57644h;

    /* renamed from: i */
    private static final int f57645i;

    /* renamed from: j */
    private static final byte[] f57646j = {0, 0, 1, 0};

    /* renamed from: k */
    private static final int f57647k = 4;

    /* renamed from: l */
    private static final String[] f57648l;

    /* renamed from: m */
    private static final int f57649m;

    /* renamed from: a */
    final int f57650a = C24087g.m45609a(21, 20, f57639c, f57641e, 6, f57645i, f57647k, f57649m);

    @Override // com.facebook.p1870h.C24314c.AbstractC24315a
    /* renamed from: a */
    public final int mo34188a() {
        return this.f57650a;
    }

    static {
        Covode.recordClassIndex(28453);
        byte[] a = C24317e.m46274a("BM");
        f57644h = a;
        f57645i = a.length;
        String[] strArr = {"heic", "heix", "hevc", "hevx", "mif1", "msf1"};
        f57648l = strArr;
        f57649m = C24317e.m46274a("ftyp" + strArr[0]).length;
    }

    @Override // com.facebook.p1870h.C24314c.AbstractC24315a
    /* renamed from: a */
    public final C24314c mo34189a(byte[] bArr, int i) {
        boolean z;
        boolean z2;
        C24091i.m45617a(bArr);
        if (C24138c.m45746a(bArr, 0, i)) {
            C24091i.m45620a(C24138c.m45746a(bArr, 0, i));
            if (C24138c.m45747a(bArr, 12, C24138c.f57086e)) {
                return C24313b.f57656f;
            }
            if (C24138c.m45747a(bArr, 12, C24138c.f57087f)) {
                return C24313b.f57657g;
            }
            if (i < 21 || !C24138c.m45747a(bArr, 12, C24138c.f57088g)) {
                return C24314c.f57663a;
            }
            boolean a = C24138c.m45747a(bArr, 12, C24138c.f57088g);
            if ((bArr[20] & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (a && z) {
                return C24313b.f57660j;
            }
            boolean a2 = C24138c.m45747a(bArr, 12, C24138c.f57088g);
            if ((bArr[20] & 16) == 16) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!a2 || !z2) {
                return C24313b.f57658h;
            }
            return C24313b.f57659i;
        }
        byte[] bArr2 = f57638b;
        if (i >= bArr2.length && C24317e.m46273a(bArr, bArr2)) {
            return C24313b.f57651a;
        }
        byte[] bArr3 = f57640d;
        if (i >= bArr3.length && C24317e.m46273a(bArr, bArr3)) {
            return C24313b.f57652b;
        }
        if (i >= 6 && (C24317e.m46273a(bArr, f57642f) || C24317e.m46273a(bArr, f57643g))) {
            return C24313b.f57653c;
        }
        byte[] bArr4 = f57644h;
        if (i >= bArr4.length && C24317e.m46273a(bArr, bArr4)) {
            return C24313b.f57654d;
        }
        byte[] bArr5 = f57646j;
        if (i >= bArr5.length && C24317e.m46273a(bArr, bArr5)) {
            return C24313b.f57655e;
        }
        if (i >= f57649m && bArr[3] >= 8) {
            String[] strArr = f57648l;
            for (String str : strArr) {
                int length = bArr.length;
                byte[] a3 = C24317e.m46274a("ftyp".concat(String.valueOf(str)));
                int i2 = f57649m;
                C24091i.m45617a(bArr);
                C24091i.m45617a(a3);
                if (i2 <= length) {
                    byte b = a3[0];
                    int i3 = length - i2;
                    int i4 = 0;
                    while (true) {
                        if (i4 > i3) {
                            continue;
                            break;
                        }
                        if (bArr[i4] != b) {
                            do {
                                i4++;
                                if (i4 > i3) {
                                    break;
                                }
                            } while (bArr[i4] != b);
                        }
                        if (i4 <= i3) {
                            int i5 = i4 + 1;
                            int i6 = (i5 + i2) - 1;
                            int i7 = 1;
                            while (i5 < i6 && bArr[i5] == a3[i7]) {
                                i5++;
                                i7++;
                            }
                            if (i5 == i6) {
                                if (i4 >= 0) {
                                    return C24313b.f57661k;
                                }
                            }
                        }
                        i4++;
                    }
                }
            }
        }
        return C24314c.f57663a;
    }
}
