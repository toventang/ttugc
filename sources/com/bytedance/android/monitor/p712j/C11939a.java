package com.bytedance.android.monitor.p712j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.monitor.j.a */
public class C11939a implements AbstractC11940b {

    /* renamed from: a */
    private static volatile C11939a f28560a;

    /* renamed from: b */
    private C11942d f28561b;

    /* renamed from: c */
    private C11941c f28562c;

    static {
        Covode.recordClassIndex(13665);
    }

    @Override // com.bytedance.android.monitor.p712j.AbstractC11940b
    /* renamed from: b */
    public final C11942d mo19154b() {
        if (this.f28561b == null) {
            this.f28561b = new C11942d();
        }
        return this.f28561b;
    }

    @Override // com.bytedance.android.monitor.p712j.AbstractC11940b
    /* renamed from: c */
    public final C11941c mo19155c() {
        if (this.f28562c == null) {
            this.f28562c = new C11941c();
        }
        return this.f28562c;
    }

    /* renamed from: a */
    public static C11939a m21073a() {
        MethodCollector.m26663i(1848);
        if (f28560a == null) {
            synchronized (C11939a.class) {
                try {
                    if (f28560a == null) {
                        f28560a = new C11939a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1848);
                    throw th;
                }
            }
        }
        C11939a aVar = f28560a;
        MethodCollector.m26664o(1848);
        return aVar;
    }
}
