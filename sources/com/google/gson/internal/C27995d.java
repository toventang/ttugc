package com.google.gson.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.gson.internal.d */
public final class C27995d {

    /* renamed from: a */
    public static final int f65765a;

    /* renamed from: a */
    public static boolean m56080a() {
        if (f65765a >= 9) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(33608);
        String property = System.getProperty("java.version");
        int a = m56079a(property);
        if (a == -1) {
            a = m56081b(property);
        }
        if (a == -1) {
            a = 6;
        }
        f65765a = a;
    }

    /* renamed from: a */
    private static int m56079a(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt != 1 || split.length <= 1) {
                return parseInt;
            }
            return Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static int m56081b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
