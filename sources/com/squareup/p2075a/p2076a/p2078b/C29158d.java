package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.squareup.a.a.b.d */
public final class C29158d {
    static {
        Covode.recordClassIndex(35507);
    }

    /* renamed from: a */
    public static int m58268a(String str, int i) {
        while (i < str.length() && ((r1 = str.charAt(i)) == ' ' || r1 == '\t')) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static int m58270b(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static int m58269a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }
}
