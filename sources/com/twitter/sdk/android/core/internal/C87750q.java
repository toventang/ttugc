package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.twitter.sdk.android.core.internal.q */
public final class C87750q {

    /* renamed from: a */
    public final String f199302a;

    static {
        Covode.recordClassIndex(103746);
    }

    public C87750q() {
        this("https://api.twitter.com");
    }

    private C87750q(String str) {
        this.f199302a = str;
    }

    /* renamed from: a */
    public static String m152718a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt > 31 && charAt < 127) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
