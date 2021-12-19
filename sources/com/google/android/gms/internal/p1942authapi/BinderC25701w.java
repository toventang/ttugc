package com.google.android.gms.internal.p1942authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.w */
final class BinderC25701w extends BinderC25697s {

    /* renamed from: a */
    private final /* synthetic */ C25698t f60838a;

    static {
        Covode.recordClassIndex(31115);
    }

    BinderC25701w(C25698t tVar) {
        this.f60838a = tVar;
    }

    @Override // com.google.android.gms.internal.p1942authapi.BinderC25697s, com.google.android.gms.internal.p1942authapi.AbstractC25676ab
    /* renamed from: a */
    public final void mo41926a(Status status) {
        this.f60838a.mo41542a((AbstractC25485p) C25696r.m49625a(status));
    }

    @Override // com.google.android.gms.internal.p1942authapi.BinderC25697s, com.google.android.gms.internal.p1942authapi.AbstractC25676ab
    /* renamed from: a */
    public final void mo41927a(Status status, Credential credential) {
        this.f60838a.mo41542a((AbstractC25485p) new C25696r(status, credential));
    }
}
