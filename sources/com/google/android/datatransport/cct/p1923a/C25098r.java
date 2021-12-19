package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.p2008a.AbstractC27682d;
import com.google.firebase.p2008a.AbstractC27683e;
import com.google.firebase.p2008a.C27681c;

/* renamed from: com.google.android.datatransport.cct.a.r */
public final class C25098r implements AbstractC27682d<C25082h> {
    static {
        Covode.recordClassIndex(30463);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.p2008a.AbstractC27680b
    /* renamed from: a */
    public final void mo41005a(Object obj, AbstractC27683e eVar) {
        C25082h hVar = (C25082h) obj;
        AbstractC27683e eVar2 = eVar;
        eVar2.mo46304a("requestTimeMs", hVar.f59491a).mo46304a("requestUptimeMs", hVar.f59492b);
        if (hVar.f59493c != null) {
            eVar2.mo46305a("clientInfo", hVar.f59493c);
        }
        if (hVar.f59495e != null) {
            eVar2.mo46305a("logSourceName", hVar.f59495e);
        } else if (hVar.f59494d != Integer.MIN_VALUE) {
            eVar2.mo46303a("logSource", hVar.f59494d);
        } else {
            throw new C27681c("Log request must have either LogSourceName or LogSource");
        }
        if (!hVar.f59496f.isEmpty()) {
            eVar2.mo46305a("logEvent", hVar.f59496f);
        }
    }
}
