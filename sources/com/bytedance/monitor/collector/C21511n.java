package com.bytedance.monitor.collector;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.monitor.collector.n */
public final class C21511n {

    /* renamed from: a */
    static long f51057a = -1;

    /* renamed from: b */
    static long f51058b = -1;

    static {
        Covode.recordClassIndex(25138);
    }

    /* renamed from: a */
    static long m40407a(String str) {
        try {
            int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.Os");
            Object obj = cls.getField("os").get(null);
            return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(obj, Integer.valueOf(i))).longValue();
        } catch (Throwable unused) {
            return 100;
        }
    }
}
