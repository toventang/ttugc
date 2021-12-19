package com.bytedance.globalpayment.payment.common.lib.p1078h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15240a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15254a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15255b;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15256c;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15258d;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15259e;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15262f;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a.C15266g;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15269a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15270b;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15271c;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15272d;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15273e;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15274f;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15275g;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.h.a */
public class C15253a implements AbstractC15268b {

    /* renamed from: a */
    private static volatile AbstractC15268b f37244a;

    /* renamed from: b */
    private static volatile AbstractC15273e f37245b;

    /* renamed from: c */
    private static volatile AbstractC15270b f37246c;

    /* renamed from: d */
    private static volatile AbstractC15275g f37247d;

    /* renamed from: e */
    private static volatile AbstractC15269a f37248e;

    /* renamed from: f */
    private static volatile AbstractC15272d f37249f;

    /* renamed from: g */
    private static volatile AbstractC15272d f37250g;

    /* renamed from: h */
    private static volatile AbstractC15274f f37251h;

    /* renamed from: i */
    private static volatile AbstractC15271c f37252i;

    static {
        Covode.recordClassIndex(17453);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.AbstractC15268b
    /* renamed from: b */
    public final void mo24702b() {
        mo24708h();
        C15240a c = mo24709i().mo24714c();
        if (c != null && c.f37186r != null) {
            mo24710j().mo24719a(c.f37186r);
        }
    }

    /* renamed from: a */
    public static AbstractC15268b m28071a() {
        MethodCollector.m26663i(3347);
        if (f37244a == null) {
            synchronized (C15253a.class) {
                try {
                    if (f37244a == null) {
                        f37244a = new C15253a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3347);
                    throw th;
                }
            }
        }
        AbstractC15268b bVar = f37244a;
        MethodCollector.m26664o(3347);
        return bVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.AbstractC15268b
    /* renamed from: c */
    public final AbstractC15271c mo24703c() {
        MethodCollector.m26663i(3371);
        if (f37252i == null) {
            synchronized (this) {
                try {
                    if (f37252i == null) {
                        f37252i = new C15256c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3371);
                    throw th;
                }
            }
        }
        AbstractC15271c cVar = f37252i;
        MethodCollector.m26664o(3371);
        return cVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.AbstractC15268b
    /* renamed from: d */
    public final AbstractC15273e mo24704d() {
        MethodCollector.m26663i(3375);
        if (f37245b == null) {
            synchronized (this) {
                try {
                    if (f37245b == null) {
                        f37245b = new C15259e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3375);
                    throw th;
                }
            }
        }
        AbstractC15273e eVar = f37245b;
        MethodCollector.m26664o(3375);
        return eVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.AbstractC15268b
    /* renamed from: e */
    public final AbstractC15272d mo24705e() {
        MethodCollector.m26663i(3376);
        if (f37249f == null) {
            synchronized (this) {
                try {
                    if (f37249f == null) {
                        f37249f = new C15258d("IAP");
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3376);
                    throw th;
                }
            }
        }
        AbstractC15272d dVar = f37249f;
        MethodCollector.m26664o(3376);
        return dVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.AbstractC15268b
    /* renamed from: f */
    public final AbstractC15272d mo24706f() {
        MethodCollector.m26663i(3377);
        if (f37250g == null) {
            synchronized (this) {
                try {
                    if (f37250g == null) {
                        f37250g = new C15258d("ECommerce");
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3377);
                    throw th;
                }
            }
        }
        AbstractC15272d dVar = f37250g;
        MethodCollector.m26664o(3377);
        return dVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.AbstractC15268b
    /* renamed from: g */
    public final AbstractC15274f mo24707g() {
        MethodCollector.m26663i(3384);
        if (f37251h == null) {
            synchronized (this) {
                try {
                    if (f37251h == null) {
                        f37251h = new C15262f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3384);
                    throw th;
                }
            }
        }
        AbstractC15274f fVar = f37251h;
        MethodCollector.m26664o(3384);
        return fVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.AbstractC15268b
    /* renamed from: h */
    public final AbstractC15275g mo24708h() {
        MethodCollector.m26663i(3386);
        if (f37247d == null) {
            synchronized (this) {
                try {
                    if (f37247d == null) {
                        f37247d = new C15266g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3386);
                    throw th;
                }
            }
        }
        AbstractC15275g gVar = f37247d;
        MethodCollector.m26664o(3386);
        return gVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.AbstractC15268b
    /* renamed from: i */
    public final AbstractC15269a mo24709i() {
        MethodCollector.m26663i(3387);
        if (f37248e == null) {
            synchronized (this) {
                try {
                    if (f37248e == null) {
                        f37248e = new C15254a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3387);
                    throw th;
                }
            }
        }
        AbstractC15269a aVar = f37248e;
        MethodCollector.m26664o(3387);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.AbstractC15268b
    /* renamed from: j */
    public final AbstractC15270b mo24710j() {
        MethodCollector.m26663i(3391);
        if (f37246c == null) {
            synchronized (this) {
                try {
                    if (f37246c == null) {
                        f37246c = new C15255b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3391);
                    throw th;
                }
            }
        }
        AbstractC15270b bVar = f37246c;
        MethodCollector.m26664o(3391);
        return bVar;
    }
}
