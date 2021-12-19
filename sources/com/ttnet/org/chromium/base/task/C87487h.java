package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.ThreadUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ttnet.org.chromium.base.task.h */
final class C87487h implements AbstractC87493m {

    /* renamed from: a */
    private final Map<C87496p, AbstractC87494n> f198446a = new HashMap();

    static {
        Covode.recordClassIndex(103433);
    }

    C87487h() {
    }

    /* renamed from: a */
    private synchronized C87482e m151837a() {
        C87482e eVar;
        MethodCollector.m26663i(9837);
        eVar = (C87482e) ThreadUtils.m151756a(CallableC87488i.f198447a);
        MethodCollector.m26664o(9837);
        return eVar;
    }

    /* renamed from: a */
    private AbstractC87494n m151838a(C87496p pVar) {
        if (pVar.f198471r) {
            return m151837a();
        }
        return new TaskRunnerImpl(pVar);
    }

    @Override // com.ttnet.org.chromium.base.task.AbstractC87493m
    /* renamed from: a */
    public final synchronized void mo141556a(C87496p pVar, Runnable runnable) {
        boolean z;
        MethodCollector.m26663i(9689);
        if (pVar.f198469p != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC87494n a = m151838a(pVar);
            a.mo141539a(runnable, 0);
            a.mo141538a();
            MethodCollector.m26664o(9689);
            return;
        }
        AbstractC87494n nVar = this.f198446a.get(pVar);
        if (nVar == null) {
            nVar = m151838a(pVar);
            nVar.mo141540b();
            this.f198446a.put(pVar, nVar);
        }
        nVar.mo141539a(runnable, 0);
        MethodCollector.m26664o(9689);
    }
}
