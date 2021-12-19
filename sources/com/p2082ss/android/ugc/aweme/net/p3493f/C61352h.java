package com.p2082ss.android.ugc.aweme.net.p3493f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.net.f.h */
public final class C61352h {

    /* renamed from: a */
    public static Callable<Boolean> f139334a = CallableC61353i.f139336a;

    /* renamed from: b */
    private static Boolean f139335b;

    static {
        Covode.recordClassIndex(71985);
    }

    /* renamed from: a */
    public static synchronized boolean m111093a() {
        boolean z;
        Callable<Boolean> callable;
        synchronized (C61352h.class) {
            MethodCollector.m26663i(3538);
            z = false;
            if (f139335b == null && (callable = f139334a) != null) {
                try {
                    f139335b = callable.call();
                } catch (Exception unused) {
                    f139335b = false;
                }
            }
            Boolean bool = f139335b;
            if (bool != null) {
                z = bool.booleanValue();
            }
            MethodCollector.m26664o(3538);
        }
        return z;
    }
}
