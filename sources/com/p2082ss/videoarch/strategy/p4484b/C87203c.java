package com.p2082ss.videoarch.strategy.p4484b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.videoarch.strategy.p4484b.C87204d;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.videoarch.strategy.b.c */
public class C87203c {

    /* renamed from: e */
    private static volatile C87203c f197457e;

    /* renamed from: a */
    public final C87213f f197458a = new C87213f();

    /* renamed from: b */
    public C87200a f197459b;

    /* renamed from: c */
    public C87207e f197460c;

    /* renamed from: d */
    public ThreadPoolExecutor f197461d;

    /* renamed from: f */
    private C87204d f197462f;

    static {
        Covode.recordClassIndex(103006);
    }

    public C87203c() {
        mo141071a(new C87204d.C87205a().mo141072a());
    }

    /* renamed from: a */
    public static C87203c m151234a() {
        MethodCollector.m26663i(11127);
        if (f197457e == null) {
            synchronized (C87203c.class) {
                try {
                    if (f197457e == null) {
                        f197457e = new C87203c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11127);
                    throw th;
                }
            }
        }
        C87203c cVar = f197457e;
        MethodCollector.m26664o(11127);
        return cVar;
    }

    /* renamed from: a */
    public final void mo141071a(C87204d dVar) {
        if (dVar != null) {
            this.f197462f = dVar;
            this.f197459b = new C87200a(this.f197462f);
            this.f197460c = new C87207e(this.f197458a, this.f197459b);
            this.f197461d = dVar.f197466d;
        }
    }
}
