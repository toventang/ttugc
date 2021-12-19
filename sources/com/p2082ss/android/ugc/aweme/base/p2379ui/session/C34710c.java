package com.p2082ss.android.ugc.aweme.base.p2379ui.session;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.base.ui.session.c */
public class C34710c {

    /* renamed from: b */
    private static C34710c f81993b;

    /* renamed from: a */
    HashMap<String, C34708a> f81994a = new HashMap<>();

    static {
        Covode.recordClassIndex(41699);
    }

    private C34710c() {
    }

    /* renamed from: a */
    public static C34710c m70888a() {
        MethodCollector.m26663i(11499);
        if (f81993b == null) {
            synchronized (C34710c.class) {
                try {
                    if (f81993b == null) {
                        f81993b = new C34710c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11499);
                    throw th;
                }
            }
        }
        C34710c cVar = f81993b;
        MethodCollector.m26664o(11499);
        return cVar;
    }

    /* renamed from: a */
    public final synchronized void mo61387a(C34708a aVar) {
        MethodCollector.m26663i(11667);
        this.f81994a.values().remove(aVar);
        MethodCollector.m26664o(11667);
    }

    /* renamed from: b */
    public final synchronized <T> C34708a<T> mo61388b(String str) {
        C34708a<T> aVar;
        MethodCollector.m26663i(11666);
        aVar = this.f81994a.get(str);
        MethodCollector.m26664o(11666);
        return aVar;
    }

    /* renamed from: a */
    public final synchronized <T> C34708a<T> mo61386a(String str) {
        C34708a<T> aVar;
        MethodCollector.m26663i(11665);
        if (!this.f81994a.containsKey(str)) {
            this.f81994a.put(str, new C34708a());
        }
        aVar = this.f81994a.get(str);
        MethodCollector.m26664o(11665);
        return aVar;
    }
}
