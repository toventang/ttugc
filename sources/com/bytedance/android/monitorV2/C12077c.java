package com.bytedance.android.monitorV2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.monitorV2.c */
public class C12077c {

    /* renamed from: b */
    private static volatile C12077c f28940b;

    /* renamed from: a */
    Map<String, Set<String>> f28941a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(13806);
    }

    private C12077c() {
    }

    /* renamed from: a */
    public static C12077c m21502a() {
        MethodCollector.m26663i(2155);
        if (f28940b == null) {
            synchronized (C12077c.class) {
                try {
                    if (f28940b == null) {
                        f28940b = new C12077c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2155);
                    throw th;
                }
            }
        }
        C12077c cVar = f28940b;
        MethodCollector.m26664o(2155);
        return cVar;
    }
}
