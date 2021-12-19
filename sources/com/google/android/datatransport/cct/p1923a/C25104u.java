package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.p2008a.AbstractC27682d;
import com.google.firebase.p2008a.AbstractC27683e;

/* renamed from: com.google.android.datatransport.cct.a.u */
public final class C25104u implements AbstractC27682d<C25085j> {
    static {
        Covode.recordClassIndex(30469);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.p2008a.AbstractC27680b
    /* renamed from: a */
    public final void mo41005a(Object obj, AbstractC27683e eVar) {
        C25085j jVar = (C25085j) obj;
        AbstractC27683e eVar2 = eVar;
        if (jVar.f59507b != null) {
            eVar2.mo46305a("mobileSubtype", jVar.f59507b.name());
        }
        if (jVar.f59506a != null) {
            eVar2.mo46305a("networkType", jVar.f59506a.name());
        }
    }
}
