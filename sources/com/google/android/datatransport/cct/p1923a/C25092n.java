package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.p2008a.AbstractC27682d;
import com.google.firebase.p2008a.AbstractC27683e;

/* renamed from: com.google.android.datatransport.cct.a.n */
public final class C25092n implements AbstractC27682d<C25078f> {
    static {
        Covode.recordClassIndex(30457);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.p2008a.AbstractC27680b
    /* renamed from: a */
    public final void mo41005a(Object obj, AbstractC27683e eVar) {
        C25078f fVar = (C25078f) obj;
        AbstractC27683e eVar2 = eVar;
        if (fVar.f59473a != null) {
            eVar2.mo46305a("clientType", fVar.f59473a.name());
        }
        if (fVar.f59474b != null) {
            eVar2.mo46305a("androidClientInfo", fVar.f59474b);
        }
    }
}
