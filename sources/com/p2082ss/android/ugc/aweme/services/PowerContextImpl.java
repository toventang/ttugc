package com.p2082ss.android.ugc.aweme.services;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.IPowerContext;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.C81908b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.PowerContextImpl */
public final class PowerContextImpl implements IPowerContext {
    static {
        Covode.recordClassIndex(79706);
    }

    @Override // com.bytedance.ies.powerlist.IPowerContext
    public final Application getApplication() {
        Application a = C17879g.m33104a();
        C89219l.m154716b(a, "");
        return a;
    }

    public static IPowerContext createIPowerContextbyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(4696);
        Object a = C81908b.m141854a(IPowerContext.class, z);
        if (a != null) {
            IPowerContext iPowerContext = (IPowerContext) a;
            MethodCollector.m26664o(4696);
            return iPowerContext;
        }
        if (C81908b.f183353dx == null) {
            synchronized (IPowerContext.class) {
                try {
                    if (C81908b.f183353dx == null) {
                        C81908b.f183353dx = new PowerContextImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4696);
                    throw th;
                }
            }
        }
        PowerContextImpl powerContextImpl = (PowerContextImpl) C81908b.f183353dx;
        MethodCollector.m26664o(4696);
        return powerContextImpl;
    }
}
