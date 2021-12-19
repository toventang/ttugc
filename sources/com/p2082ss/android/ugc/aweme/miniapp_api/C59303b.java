package com.p2082ss.android.ugc.aweme.miniapp_api;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3444a.C59311a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.b */
public class C59303b {

    /* renamed from: c */
    private static volatile C59303b f135512c;

    /* renamed from: a */
    public Map<String, Boolean> f135513a = new HashMap();

    /* renamed from: b */
    public C59311a f135514b;

    static {
        Covode.recordClassIndex(69681);
    }

    private C59303b() {
    }

    /* renamed from: a */
    public static C59303b m109000a() {
        MethodCollector.m26663i(14202);
        if (f135512c == null) {
            synchronized (C59303b.class) {
                try {
                    if (f135512c == null) {
                        f135512c = new C59303b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14202);
                    throw th;
                }
            }
        }
        C59303b bVar = f135512c;
        MethodCollector.m26664o(14202);
        return bVar;
    }
}
