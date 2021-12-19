package com.google.android.gms.internal.p1942authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25446d;

/* renamed from: com.google.android.gms.internal.auth-api.y */
final class BinderC25703y extends BinderC25697s {

    /* renamed from: a */
    private C25446d.AbstractC25448b<Status> f60839a;

    static {
        Covode.recordClassIndex(31117);
    }

    BinderC25703y(C25446d.AbstractC25448b<Status> bVar) {
        this.f60839a = bVar;
    }

    @Override // com.google.android.gms.internal.p1942authapi.BinderC25697s, com.google.android.gms.internal.p1942authapi.AbstractC25676ab
    /* renamed from: a */
    public final void mo41926a(Status status) {
        this.f60839a.mo41419a(status);
    }
}
