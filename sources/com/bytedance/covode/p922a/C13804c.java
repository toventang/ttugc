package com.bytedance.covode.p922a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.covode.a.c */
public final class C13804c {

    /* renamed from: a */
    public static Map<String, Long> f33568a = new HashMap();

    static {
        Covode.recordClassIndex(15852);
    }

    /* renamed from: a */
    public static void m24916a(String str) {
        Long l = f33568a.get(str);
        if (l != null) {
            System.currentTimeMillis();
            l.longValue();
        }
    }
}
