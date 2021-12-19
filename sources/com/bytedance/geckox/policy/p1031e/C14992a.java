package com.bytedance.geckox.policy.p1031e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14905e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.policy.e.a */
public class C14992a {

    /* renamed from: b */
    public static long f36624b;

    /* renamed from: d */
    private static C14992a f36625d;

    /* renamed from: a */
    public C14905e f36626a;

    /* renamed from: c */
    public AtomicBoolean f36627c = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17129);
    }

    private C14992a() {
    }

    /* renamed from: a */
    public static C14992a m27593a() {
        MethodCollector.m26663i(3175);
        if (f36625d == null) {
            synchronized (C14992a.class) {
                try {
                    if (f36625d == null) {
                        f36625d = new C14992a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3175);
                    throw th;
                }
            }
        }
        C14992a aVar = f36625d;
        MethodCollector.m26664o(3175);
        return aVar;
    }
}
