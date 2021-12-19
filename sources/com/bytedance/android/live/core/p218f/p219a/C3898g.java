package com.bytedance.android.live.core.p218f.p219a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.core.f.a.g */
public class C3898g {

    /* renamed from: b */
    private static C3898g f10793b;

    /* renamed from: a */
    public final ConcurrentHashMap<String, Integer> f10794a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(4427);
    }

    private C3898g() {
    }

    /* renamed from: a */
    public static C3898g m9526a() {
        MethodCollector.m26663i(11382);
        C3898g gVar = f10793b;
        if (gVar != null) {
            MethodCollector.m26664o(11382);
            return gVar;
        }
        synchronized (C3898g.class) {
            try {
                if (f10793b == null) {
                    f10793b = new C3898g();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(11382);
                throw th;
            }
        }
        C3898g gVar2 = f10793b;
        MethodCollector.m26664o(11382);
        return gVar2;
    }
}
