package com.benchmark.collection;

import com.benchmark.port.C2499b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.benchmark.collection.b */
public final class C2439b {

    /* renamed from: a */
    public static C2439b f7341a = new C2439b();

    /* renamed from: b */
    public C2437a f7342b = new C2437a();

    /* renamed from: c */
    private AbstractC2460f f7343c;

    static {
        Covode.recordClassIndex(2792);
    }

    private C2439b() {
    }

    /* renamed from: a */
    public final synchronized AbstractC2460f mo6804a() {
        MethodCollector.m26663i(6442);
        if (!C2499b.f7582a.get()) {
            MethodCollector.m26664o(6442);
            return null;
        }
        if (this.f7343c == null) {
            this.f7343c = new C2442d();
        }
        AbstractC2460f fVar = this.f7343c;
        MethodCollector.m26664o(6442);
        return fVar;
    }
}
