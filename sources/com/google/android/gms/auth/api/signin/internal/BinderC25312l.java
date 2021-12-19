package com.google.android.gms.auth.api.signin.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.l */
final class BinderC25312l extends BinderC25304d {

    /* renamed from: a */
    private final /* synthetic */ C25310j f60057a;

    static {
        Covode.recordClassIndex(30702);
    }

    BinderC25312l(C25310j jVar) {
        this.f60057a = jVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractC25317q, com.google.android.gms.auth.api.signin.internal.BinderC25304d
    /* renamed from: a */
    public final void mo41407a(Status status) {
        this.f60057a.mo41542a((AbstractC25485p) status);
    }
}
