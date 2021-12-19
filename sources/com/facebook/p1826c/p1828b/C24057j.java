package com.facebook.p1826c.p1828b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.p1826c.p1827a.AbstractC24023c;
import com.facebook.p1826c.p1827a.AbstractC24024d;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.io.IOException;

/* renamed from: com.facebook.c.b.j */
public final class C24057j implements AbstractC24023c {

    /* renamed from: h */
    private static final Object f56976h = new Object();

    /* renamed from: i */
    private static C24057j f56977i;

    /* renamed from: j */
    private static int f56978j;

    /* renamed from: a */
    AbstractC24026e f56979a;

    /* renamed from: b */
    String f56980b;

    /* renamed from: c */
    long f56981c;

    /* renamed from: d */
    long f56982d;

    /* renamed from: e */
    long f56983e;

    /* renamed from: f */
    IOException f56984f;

    /* renamed from: g */
    AbstractC24024d.EnumC24025a f56985g;

    /* renamed from: k */
    private C24057j f56986k;

    private C24057j() {
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24023c
    /* renamed from: a */
    public final AbstractC24026e mo39542a() {
        return this.f56979a;
    }

    static {
        Covode.recordClassIndex(28183);
    }

    /* renamed from: d */
    private void m45561d() {
        this.f56979a = null;
        this.f56980b = null;
        this.f56981c = 0;
        this.f56982d = 0;
        this.f56983e = 0;
        this.f56984f = null;
        this.f56985g = null;
    }

    /* renamed from: b */
    public static C24057j m45560b() {
        MethodCollector.m26663i(2904);
        synchronized (f56976h) {
            try {
                C24057j jVar = f56977i;
                if (jVar != null) {
                    f56977i = jVar.f56986k;
                    jVar.f56986k = null;
                    f56978j--;
                    return jVar;
                }
                C24057j jVar2 = new C24057j();
                MethodCollector.m26664o(2904);
                return jVar2;
            } finally {
                MethodCollector.m26664o(2904);
            }
        }
    }

    /* renamed from: c */
    public final void mo39592c() {
        MethodCollector.m26663i(2908);
        synchronized (f56976h) {
            try {
                if (f56978j < 5) {
                    m45561d();
                    f56978j++;
                    C24057j jVar = f56977i;
                    if (jVar != null) {
                        this.f56986k = jVar;
                    }
                    f56977i = this;
                }
            } finally {
                MethodCollector.m26664o(2908);
            }
        }
    }
}
