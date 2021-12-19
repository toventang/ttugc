package com.bytedance.ies.p1206f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.ies.f.a */
public final class C17308a {

    /* renamed from: a */
    public static String f41585a = "notify.log";

    /* renamed from: b */
    public static SimpleDateFormat f41586b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: c */
    private static ExecutorService f41587c;

    static {
        Covode.recordClassIndex(19792);
    }

    /* renamed from: a */
    public static synchronized void m32047a() {
        synchronized (C17308a.class) {
            MethodCollector.m26663i(5062);
            try {
                ExecutorService executorService = f41587c;
                if (executorService != null) {
                    executorService.shutdown();
                }
                MethodCollector.m26664o(5062);
            } catch (Exception unused) {
                MethodCollector.m26664o(5062);
            }
        }
    }
}
