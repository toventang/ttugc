package com.bytedance.ies.ugc.aweme.rich.p1268a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.rich.a.b */
public final class C18135b {

    /* renamed from: a */
    public static final C18135b f43193a = new C18135b();

    /* renamed from: b */
    private static final List<AbstractC18136c> f43194b = new ArrayList();

    private C18135b() {
    }

    static {
        Covode.recordClassIndex(20776);
    }

    /* renamed from: a */
    public final synchronized void mo28908a(AbstractC18136c cVar) {
        MethodCollector.m26663i(9445);
        if (cVar != null) {
            List<AbstractC18136c> list = f43194b;
            if (!list.contains(cVar)) {
                list.add(cVar);
                MethodCollector.m26664o(9445);
                return;
            }
        }
        MethodCollector.m26664o(9445);
    }

    /* renamed from: b */
    public final synchronized void mo28909b(AbstractC18136c cVar) {
        MethodCollector.m26663i(9592);
        if (cVar != null) {
            List<AbstractC18136c> list = f43194b;
            if (list.contains(cVar)) {
                list.remove(cVar);
                MethodCollector.m26664o(9592);
                return;
            }
        }
        MethodCollector.m26664o(9592);
    }

    /* renamed from: a */
    public static final synchronized C18129a.C18130a m33759a(AwemeRawAd awemeRawAd, C18129a.C18130a aVar) {
        synchronized (C18135b.class) {
            MethodCollector.m26663i(9593);
            C89219l.m154721d(awemeRawAd, "");
            C89219l.m154721d(aVar, "");
            List<AbstractC18136c> list = f43194b;
            if (list.isEmpty()) {
                MethodCollector.m26664o(9593);
                return aVar;
            }
            for (AbstractC18136c cVar : list) {
                try {
                    cVar.mo28558a(awemeRawAd, aVar);
                } catch (Throwable unused) {
                }
            }
            MethodCollector.m26664o(9593);
            return aVar;
        }
    }
}
