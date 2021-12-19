package com.bytedance.geckox.policy.p1030d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.statistic.model.C15039a;
import com.bytedance.p1603q.p1604a.C21930e;

/* renamed from: com.bytedance.geckox.policy.d.a */
public final class C14986a {

    /* renamed from: a */
    private static int f36604a;

    /* renamed from: b */
    private static long f36605b;

    /* renamed from: c */
    private static long f36606c;

    /* renamed from: d */
    private boolean f36607d;

    /* renamed from: e */
    private C15039a f36608e;

    /* renamed from: f */
    private int f36609f;

    static {
        Covode.recordClassIndex(17123);
    }

    /* renamed from: b */
    public final synchronized void mo24197b() {
        MethodCollector.m26663i(4900);
        f36604a = 0;
        MethodCollector.m26664o(4900);
    }

    /* renamed from: c */
    public final synchronized void mo24198c() {
        MethodCollector.m26663i(4901);
        f36604a++;
        f36605b = System.currentTimeMillis();
        MethodCollector.m26664o(4901);
    }

    /* renamed from: a */
    public final synchronized void mo24196a() {
        MethodCollector.m26663i(4850);
        if (System.currentTimeMillis() - f36605b > 60000) {
            f36604a = 0;
        }
        if (f36604a == 3 && this.f36609f == 1) {
            this.f36607d = true;
            f36606c = System.currentTimeMillis();
        } else {
            this.f36607d = false;
        }
        if (!this.f36607d || System.currentTimeMillis() - f36606c > 60000) {
            this.f36607d = false;
            MethodCollector.m26664o(4850);
        } else {
            C14957a.m27543a("gecko update request exception hit");
            this.f36608e.f36724h = 1;
            this.f36608e.f36725i = 601;
            C21930e eVar = new C21930e(601, "gecko update request is intercepted", new Throwable("gecko update request failed more than 3 times"));
            MethodCollector.m26664o(4850);
            throw eVar;
        }
    }

    public C14986a(int i, C15039a aVar) {
        this.f36609f = i;
        this.f36608e = aVar;
    }
}
