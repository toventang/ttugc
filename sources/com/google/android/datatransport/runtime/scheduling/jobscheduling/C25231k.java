package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.backends.AbstractC25132g;
import com.google.android.datatransport.runtime.p1926c.AbstractC25144b;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25187g;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.k */
final /* synthetic */ class C25231k implements AbstractC25144b.AbstractC25145a {

    /* renamed from: a */
    private final C25228h f59739a;

    /* renamed from: b */
    private final AbstractC25132g f59740b;

    /* renamed from: c */
    private final Iterable f59741c;

    /* renamed from: d */
    private final AbstractC25162k f59742d;

    /* renamed from: e */
    private final int f59743e;

    static {
        Covode.recordClassIndex(30599);
    }

    C25231k(C25228h hVar, AbstractC25132g gVar, Iterable iterable, AbstractC25162k kVar, int i) {
        this.f59739a = hVar;
        this.f59740b = gVar;
        this.f59741c = iterable;
        this.f59742d = kVar;
        this.f59743e = i;
    }

    @Override // com.google.android.datatransport.runtime.p1926c.AbstractC25144b.AbstractC25145a
    /* renamed from: a */
    public final Object mo41129a() {
        C25228h hVar = this.f59739a;
        AbstractC25132g gVar = this.f59740b;
        Iterable<AbstractC25187g> iterable = this.f59741c;
        AbstractC25162k kVar = this.f59742d;
        int i = this.f59743e;
        if (gVar.mo41105a() == AbstractC25132g.EnumC25133a.TRANSIENT_ERROR) {
            hVar.f59728c.mo41178a(iterable);
            hVar.f59729d.mo41192a(kVar, i + 1);
            return null;
        }
        hVar.f59728c.mo41180b(iterable);
        if (gVar.mo41105a() == AbstractC25132g.EnumC25133a.OK) {
            hVar.f59728c.mo41177a(kVar, hVar.f59731f.mo41134a() + gVar.mo41106b());
        }
        if (!hVar.f59728c.mo41181b(kVar)) {
            return null;
        }
        hVar.f59729d.mo41192a(kVar, 1);
        return null;
    }
}
