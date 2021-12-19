package com.p2082ss.optimizer.live.sdk.p4400a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.optimizer.live.sdk.p4400a.C86126c;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.optimizer.live.sdk.a.d */
public class C86129d {

    /* renamed from: f */
    private static volatile C86129d f192058f;

    /* renamed from: a */
    public final C86135f f192059a = new C86135f();

    /* renamed from: b */
    public C86123a f192060b;

    /* renamed from: c */
    public C86130e f192061c;

    /* renamed from: d */
    public ThreadPoolExecutor f192062d;

    /* renamed from: e */
    public boolean f192063e;

    /* renamed from: g */
    private C86126c f192064g;

    static {
        Covode.recordClassIndex(101270);
    }

    public C86129d() {
        mo136403a(new C86126c.C86127a().mo136402a());
    }

    /* renamed from: a */
    public static C86129d m147927a() {
        MethodCollector.m26663i(6182);
        if (f192058f == null) {
            synchronized (C86129d.class) {
                try {
                    if (f192058f == null) {
                        f192058f = new C86129d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6182);
                    throw th;
                }
            }
        }
        C86129d dVar = f192058f;
        MethodCollector.m26664o(6182);
        return dVar;
    }

    /* renamed from: a */
    public final void mo136403a(C86126c cVar) {
        if (cVar != null) {
            this.f192064g = cVar;
            this.f192060b = new C86123a(this.f192064g);
            this.f192061c = new C86130e(this.f192059a, this.f192060b, cVar.f192048h, cVar.f192049i);
            this.f192062d = cVar.f192045e;
            this.f192063e = cVar.f192046f;
        }
    }
}
