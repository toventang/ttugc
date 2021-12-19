package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ac */
public final class C55171ac {

    /* renamed from: a */
    private static long f126223a;

    /* renamed from: b */
    private static long f126224b;

    /* renamed from: c */
    private static Map<String, Long> f126225c = new HashMap(10);

    static {
        Covode.recordClassIndex(64916);
    }

    /* renamed from: a */
    public static void m100879a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        f126223a = currentTimeMillis;
        f126225c.put(str, Long.valueOf(currentTimeMillis));
    }

    /* renamed from: b */
    public static void m100880b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        f126224b = currentTimeMillis;
        String.valueOf(currentTimeMillis - f126225c.get(str).longValue());
        f126223a = f126224b;
    }
}
