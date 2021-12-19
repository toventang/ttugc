package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.p2008a.AbstractC27682d;
import com.google.firebase.p2008a.AbstractC27683e;

/* renamed from: com.google.android.datatransport.cct.a.p */
public final class C25095p implements AbstractC27682d<C25080g> {
    static {
        Covode.recordClassIndex(30460);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.p2008a.AbstractC27680b
    /* renamed from: a */
    public final void mo41005a(Object obj, AbstractC27683e eVar) {
        C25080g gVar = (C25080g) obj;
        AbstractC27683e eVar2 = eVar;
        eVar2.mo46304a("eventTimeMs", gVar.f59477a).mo46304a("eventUptimeMs", gVar.f59479c).mo46304a("timezoneOffsetSeconds", gVar.f59482f);
        if (gVar.f59480d != null) {
            eVar2.mo46305a("sourceExtension", gVar.f59480d);
        }
        if (gVar.f59481e != null) {
            eVar2.mo46305a("sourceExtensionJsonProto3", gVar.f59481e);
        }
        if (gVar.f59478b != Integer.MIN_VALUE) {
            eVar2.mo46303a("eventCode", gVar.f59478b);
        }
        if (gVar.f59483g != null) {
            eVar2.mo46305a("networkConnectionInfo", gVar.f59483g);
        }
    }
}
