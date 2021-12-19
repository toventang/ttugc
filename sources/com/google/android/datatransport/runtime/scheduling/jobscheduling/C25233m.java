package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.p1926c.AbstractC25144b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.m */
final /* synthetic */ class C25233m implements AbstractC25144b.AbstractC25145a {

    /* renamed from: a */
    private final C25228h f59745a;

    /* renamed from: b */
    private final AbstractC25162k f59746b;

    /* renamed from: c */
    private final int f59747c;

    static {
        Covode.recordClassIndex(30601);
    }

    C25233m(C25228h hVar, AbstractC25162k kVar, int i) {
        this.f59745a = hVar;
        this.f59746b = kVar;
        this.f59747c = i;
    }

    @Override // com.google.android.datatransport.runtime.p1926c.AbstractC25144b.AbstractC25145a
    /* renamed from: a */
    public final Object mo41129a() {
        C25228h hVar = this.f59745a;
        hVar.f59729d.mo41192a(this.f59746b, this.f59747c + 1);
        return null;
    }
}
