package p4600h.p4622m;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.m.x */
public class C89371x extends C89370w {
    static {
        Covode.recordClassIndex(105455);
    }

    /* renamed from: e */
    public static final Integer m154863e(String str) {
        C89219l.m154721d(str, "");
        return C89361p.m154864f(str);
    }

    /* renamed from: g */
    public static final Long m154865g(String str) {
        C89219l.m154721d(str, "");
        return C89361p.m154866h(str);
    }

    /* renamed from: f */
    public static final Integer m154864f(String str) {
        boolean z;
        int i;
        C89219l.m154721d(str, "");
        C89332a.m154829a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int i3 = -2147483647;
        int i4 = 1;
        if (C89219l.m154703a(charAt, 48) >= 0) {
            z = false;
            i4 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i3 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i5 = -59652323;
        while (i4 < length) {
            int digit = Character.digit((int) str.charAt(i4), 10);
            if (digit < 0) {
                return null;
            }
            if ((i2 < i5 && (i5 != -59652323 || i2 < (i5 = i3 / 10))) || (i = i2 * 10) < i3 + digit) {
                return null;
            }
            i2 = i - digit;
            i4++;
        }
        if (z) {
            return Integer.valueOf(i2);
        }
        return Integer.valueOf(-i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long m154866h(java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4622m.C89371x.m154866h(java.lang.String):java.lang.Long");
    }
}
