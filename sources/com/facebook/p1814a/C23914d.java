package com.facebook.p1814a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24710b;
import java.util.HashMap;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.a.d */
public final class C23914d {

    /* renamed from: a */
    private final HashMap<C23866a, C24001o> f56623a = new HashMap<>();

    static {
        Covode.recordClassIndex(28035);
    }

    /* renamed from: a */
    public final synchronized Set<C23866a> mo39410a() {
        Set<C23866a> keySet;
        MethodCollector.m26663i(10129);
        keySet = this.f56623a.keySet();
        MethodCollector.m26664o(10129);
        return keySet;
    }

    /* renamed from: a */
    public final synchronized C24001o mo39409a(C23866a aVar) {
        C24001o oVar;
        MethodCollector.m26663i(10130);
        oVar = this.f56623a.get(aVar);
        MethodCollector.m26664o(10130);
        return oVar;
    }

    /* renamed from: b */
    private synchronized C24001o m45219b(C23866a aVar) {
        C24001o oVar;
        MethodCollector.m26663i(10131);
        oVar = this.f56623a.get(aVar);
        if (oVar == null) {
            C24699ae.m47299a();
            Context context = C24872m.f59047g;
            oVar = new C24001o(C24710b.m47327a(context), C23973h.m45327a(context));
        }
        this.f56623a.put(aVar, oVar);
        MethodCollector.m26664o(10131);
        return oVar;
    }

    /* renamed from: a */
    public final synchronized void mo39411a(C23999n nVar) {
        MethodCollector.m26663i(10128);
        if (nVar == null) {
            MethodCollector.m26664o(10128);
            return;
        }
        for (C23866a aVar : nVar.mo39481a()) {
            C24001o b = m45219b(aVar);
            for (C23909c cVar : nVar.mo39480a(aVar)) {
                b.mo39485a(cVar);
            }
        }
        MethodCollector.m26664o(10128);
    }
}
