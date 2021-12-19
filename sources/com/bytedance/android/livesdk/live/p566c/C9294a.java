package com.bytedance.android.livesdk.live.p566c;

import com.bytedance.android.livesdk.live.p564a.C9286a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.live.c.a */
public class C9294a {

    /* renamed from: b */
    private static volatile C9294a f22726b;

    /* renamed from: a */
    public C9286a f22727a;

    static {
        Covode.recordClassIndex(10214);
    }

    private C9294a() {
    }

    /* renamed from: a */
    public static C9294a m17572a() {
        MethodCollector.m26663i(11155);
        if (f22726b == null) {
            synchronized (C9294a.class) {
                try {
                    if (f22726b == null) {
                        f22726b = new C9294a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11155);
                    throw th;
                }
            }
        }
        C9294a aVar = f22726b;
        MethodCollector.m26664o(11155);
        return aVar;
    }
}
