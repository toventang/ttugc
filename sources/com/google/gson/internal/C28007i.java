package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.google.gson.internal.i */
public final class C28007i {
    static {
        Covode.recordClassIndex(33620);
    }

    /* renamed from: a */
    private static String m56094a(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i)));
    }

    /* renamed from: b */
    private static String m56096b(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public static DateFormat m56095a(int i, int i2) {
        return new SimpleDateFormat(m56094a(i) + " " + m56096b(i2), Locale.US);
    }
}
