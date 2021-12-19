package com.bytedance.frameworks.baselib.network.p980b;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.p980b.AbstractC14598c;
import com.bytedance.frameworks.baselib.network.p980b.C14605g;

/* renamed from: com.bytedance.frameworks.baselib.network.b.f */
public class C14604f implements AbstractC14600d {

    /* renamed from: a */
    private static volatile boolean f35301a = true;

    /* renamed from: b */
    private static volatile C14605g f35302b;

    /* renamed from: c */
    private static volatile C14604f f35303c;

    public C14604f() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(16695);
    }

    /* renamed from: a */
    public static synchronized C14605g m26687a() {
        C14605g gVar;
        synchronized (C14604f.class) {
            MethodCollector.m26663i(8950);
            if (f35302b == null) {
                C14605g.C14606a d = new C14605g.C14606a().mo23483a().mo23484b().mo23485c().mo23487e().mo23486d();
                d.f35323j = true;
                f35302b = d.mo23488f();
            }
            gVar = f35302b;
            MethodCollector.m26664o(8950);
        }
        return gVar;
    }

    /* renamed from: b */
    public static C14604f m26689b() {
        MethodCollector.m26663i(9109);
        if (f35303c == null) {
            synchronized (C14604f.class) {
                try {
                    if (f35303c == null) {
                        f35303c = new C14604f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9109);
                    throw th;
                }
            }
        }
        C14604f fVar = f35303c;
        MethodCollector.m26664o(9109);
        return fVar;
    }

    /* renamed from: a */
    public static synchronized void m26688a(boolean z) {
        synchronized (C14604f.class) {
            MethodCollector.m26663i(8806);
            f35301a = z;
            if (f35302b != null) {
                f35302b.f35313j = f35301a;
            }
            MethodCollector.m26664o(8806);
        }
    }

    private C14604f(byte b) {
        if (f35302b == null) {
            C14605g.C14606a d = new C14605g.C14606a().mo23483a().mo23484b().mo23485c().mo23487e().mo23486d();
            d.f35323j = true;
            f35302b = d.mo23488f();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.p980b.AbstractC14600d
    /* renamed from: a */
    public final synchronized void mo23476a(AbstractRunnableC14597b bVar) {
        MethodCollector.m26663i(9263);
        C14601e eVar = C14601e.f35293c;
        if (bVar.mo23475c()) {
            MethodCollector.m26664o(9263);
            return;
        }
        bVar.mo23470a(C14601e.f35292b.incrementAndGet());
        if (bVar.mo23471a() == AbstractC14598c.EnumC14599a.IMMEDIATE) {
            eVar.mo23478a().execute(bVar);
            MethodCollector.m26664o(9263);
            return;
        }
        long j = (long) bVar.f35289e;
        if (j > 0) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = bVar;
            eVar.f35294a.sendMessageDelayed(obtain, j);
            MethodCollector.m26664o(9263);
            return;
        }
        eVar.mo23480c().execute(bVar);
        MethodCollector.m26664o(9263);
    }

    @Override // com.bytedance.frameworks.baselib.network.p980b.AbstractC14600d
    /* renamed from: b */
    public final synchronized void mo23477b(AbstractRunnableC14597b bVar) {
        MethodCollector.m26663i(9415);
        C14601e eVar = C14601e.f35293c;
        if (bVar.mo23475c()) {
            MethodCollector.m26664o(9415);
            return;
        }
        bVar.mo23470a(C14601e.f35292b.incrementAndGet());
        if (bVar.mo23471a() == AbstractC14598c.EnumC14599a.IMMEDIATE) {
            eVar.mo23478a().execute(bVar);
            MethodCollector.m26664o(9415);
            return;
        }
        long j = (long) bVar.f35289e;
        if (j > 0) {
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = bVar;
            eVar.f35294a.sendMessageDelayed(obtain, j);
            MethodCollector.m26664o(9415);
            return;
        }
        eVar.mo23479b().execute(bVar);
        MethodCollector.m26664o(9415);
    }
}
