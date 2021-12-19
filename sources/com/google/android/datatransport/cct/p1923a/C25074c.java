package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.p2008a.AbstractC27682d;
import com.google.firebase.p2008a.AbstractC27683e;

/* renamed from: com.google.android.datatransport.cct.a.c */
public final class C25074c implements AbstractC27682d<C25075d> {
    static {
        Covode.recordClassIndex(30439);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.p2008a.AbstractC27680b
    /* renamed from: a */
    public final void mo41005a(Object obj, AbstractC27683e eVar) {
        C25075d dVar = (C25075d) obj;
        AbstractC27683e eVar2 = eVar;
        if (dVar.f59456a != Integer.MIN_VALUE) {
            eVar2.mo46303a("sdkVersion", dVar.f59456a);
        }
        if (dVar.f59457b != null) {
            eVar2.mo46305a("model", dVar.f59457b);
        }
        if (dVar.f59458c != null) {
            eVar2.mo46305a("hardware", dVar.f59458c);
        }
        if (dVar.f59459d != null) {
            eVar2.mo46305a("device", dVar.f59459d);
        }
        if (dVar.f59460e != null) {
            eVar2.mo46305a("product", dVar.f59460e);
        }
        if (dVar.f59461f != null) {
            eVar2.mo46305a("osBuild", dVar.f59461f);
        }
        if (dVar.f59462g != null) {
            eVar2.mo46305a("manufacturer", dVar.f59462g);
        }
        if (dVar.f59463h != null) {
            eVar2.mo46305a("fingerprint", dVar.f59463h);
        }
    }
}
