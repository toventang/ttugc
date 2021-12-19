package com.bytedance.globalpayment.iap.google.p1070f;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.globalpayment.iap.google.f.b */
public final class C15193b {
    static {
        Covode.recordClassIndex(17373);
    }

    /* renamed from: a */
    public static String m27998a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(strArr[i]).append("\n");
        }
        String sb2 = sb.toString();
        if (sb2.endsWith("\n")) {
            sb2 = sb2.substring(0, sb2.length() - 1);
        }
        return C15192a.m27996a(sb2);
    }
}
