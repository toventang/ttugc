package com.bytedance.ies.ugc.network.partner.p1276b;

import com.bytedance.covode.number.Covode;
import java.io.EOFException;
import okhttp3.internal.C90084c;
import p4632k.C89420f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.ugc.network.partner.b.a */
public final class C18194a {

    /* renamed from: a */
    static final char[] f43330a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static {
        Covode.recordClassIndex(20850);
    }

    /* renamed from: a */
    static String m33846a(String str, boolean z) {
        return m33844a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    static String m33845a(String str, String str2, boolean z, boolean z2) {
        return m33843a(str, 0, str.length(), str2, false, z, z2);
    }

    /* renamed from: a */
    static String m33844a(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C89420f fVar = new C89420f();
                fVar.mo143801a(str, i, i3);
                while (i3 < i2) {
                    int codePointAt = str.codePointAt(i3);
                    if (codePointAt == 37) {
                        int i4 = i3 + 2;
                        if (i4 < i2) {
                            int a = C90084c.m156400a(str.charAt(i3 + 1));
                            int a2 = C90084c.m156400a(str.charAt(i4));
                            if (!(a == -1 || a2 == -1)) {
                                fVar.mo68847a((a << 4) + a2);
                                i3 = i4;
                            }
                        }
                        fVar.mo143814e(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            fVar.mo68847a(32);
                        }
                        fVar.mo143814e(codePointAt);
                    }
                    i3 += Character.charCount(codePointAt);
                }
                return fVar.mo143848r();
            }
            i3++;
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static String m33843a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z3) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && !z) || (codePointAt == 43 && z2)))) {
                C89420f fVar = new C89420f();
                fVar.mo143801a(str, i, i3);
                C89420f fVar2 = null;
                while (i3 < i2) {
                    int codePointAt2 = str.codePointAt(i3);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z2) {
                            if (z) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            fVar.mo68849a(str3);
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z3) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && !z))) {
                            if (fVar2 == null) {
                                fVar2 = new C89420f();
                            }
                            fVar2.mo143814e(codePointAt2);
                            while (!fVar2.mo143815e()) {
                                try {
                                    int h = fVar2.mo143824h() & 255;
                                    fVar.mo68847a(37);
                                    char[] cArr = f43330a;
                                    fVar.mo68847a((int) cArr[(h >> 4) & 15]);
                                    fVar.mo68847a((int) cArr[h & 15]);
                                } catch (EOFException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        } else {
                            fVar.mo143814e(codePointAt2);
                        }
                    }
                    i3 += Character.charCount(codePointAt2);
                }
                return fVar.mo143848r();
            }
            i3 += Character.charCount(codePointAt);
        }
        return str.substring(i, i2);
    }
}
