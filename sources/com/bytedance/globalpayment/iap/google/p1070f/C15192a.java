package com.bytedance.globalpayment.iap.google.p1070f;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.globalpayment.iap.google.f.a */
public final class C15192a {
    static {
        Covode.recordClassIndex(17372);
    }

    /* renamed from: a */
    public static String m27996a(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i < str.length()) {
            sb.append((char) ((str.charAt(i - 1) << '\b') + str.charAt(i)));
            i += 2;
        }
        if (i == str.length()) {
            sb.append(str.charAt(i - 1));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m27997b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            String binaryString = Integer.toBinaryString(charAt);
            if (binaryString.length() < 8) {
                sb.append((char) charAt);
            } else {
                int parseInt = Integer.parseInt(binaryString.substring(0, binaryString.length() - 8), 2);
                int parseInt2 = Integer.parseInt(binaryString.substring(binaryString.length() - 8), 2);
                sb.append((char) parseInt);
                sb.append((char) parseInt2);
            }
        }
        return sb.toString();
    }
}
