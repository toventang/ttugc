package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.utils.e */
public final class C28715e {
    static {
        Covode.recordClassIndex(34809);
    }

    /* renamed from: a */
    public static String m57502a(String str) {
        int i;
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            if (str.charAt(i2) != '\\' || (i = i2 + 1) >= length) {
                sb.append(str.charAt(i2));
            } else {
                StringBuilder sb2 = new StringBuilder();
                while (i < length && i < i2 + 5) {
                    char charAt = str.charAt(i);
                    if ((charAt >= '0' && charAt <= '9') || ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                        sb2.append(charAt);
                        i++;
                    }
                }
                try {
                    sb.append((char) Integer.parseInt(sb2.toString(), 16));
                    i2 += sb2.length();
                } catch (Exception unused) {
                    sb.append(str.charAt(i2));
                }
            }
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01b0, code lost:
        if (r6.equals("bdquo") == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b4, code lost:
        r1 = -1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m57503b(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 834
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.utils.C28715e.m57503b(java.lang.String):java.lang.String");
    }
}
