package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.facebook.imagepipeline.memory.c */
public class C24484c {

    /* renamed from: a */
    public static final int f58180a;

    /* renamed from: b */
    private static final Class<?> f58181b = C24484c.class;

    /* renamed from: c */
    private static int f58182c = 384;

    /* renamed from: d */
    private static volatile C24482b f58183d;

    static {
        int i;
        Covode.recordClassIndex(28628);
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        f58180a = i;
    }

    /* renamed from: a */
    public static C24482b m46766a() {
        MethodCollector.m26663i(7287);
        if (f58183d == null) {
            synchronized (C24484c.class) {
                try {
                    if (f58183d == null) {
                        f58183d = new C24482b(f58182c, f58180a);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7287);
                    throw th;
                }
            }
        }
        C24482b bVar = f58183d;
        MethodCollector.m26664o(7287);
        return bVar;
    }
}
