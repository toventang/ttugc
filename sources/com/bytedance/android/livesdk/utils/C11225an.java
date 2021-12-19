package com.bytedance.android.livesdk.utils;

import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;

/* renamed from: com.bytedance.android.livesdk.utils.an */
public final class C11225an {

    /* renamed from: a */
    public static volatile long f26870a = 0;

    /* renamed from: b */
    private static final SimpleDateFormat f26871b = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: c */
    private static final SimpleDateFormat f26872c = new SimpleDateFormat("HH:mm");

    static {
        Covode.recordClassIndex(12853);
    }

    /* renamed from: a */
    public static int m19878a(int i) {
        boolean z;
        if (i <= 0) {
            return 1;
        }
        if (i % 60 > 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = i / 60;
        if (z) {
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static String m19879a(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60;
        long j3 = j - (60 * j2);
        if (j2 < 10) {
            sb.append("0");
        }
        sb.append(j2).append(":");
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m19880b(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60;
        long j3 = j - (60 * j2);
        sb.append(j2).append(":");
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3);
        return sb.toString();
    }
}
