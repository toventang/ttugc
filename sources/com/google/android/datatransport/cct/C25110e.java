package com.google.android.datatransport.cct;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.datatransport.cct.e */
public final class C25110e {
    static {
        Covode.recordClassIndex(30475);
    }

    /* renamed from: a */
    static String m48140a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
