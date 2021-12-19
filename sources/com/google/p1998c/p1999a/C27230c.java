package com.google.p1998c.p1999a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.c.a.c */
public final class C27230c {
    static {
        Covode.recordClassIndex(32810);
    }

    /* renamed from: a */
    private static boolean m54197a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: a */
    public static String m54196a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m54197a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m54197a(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
