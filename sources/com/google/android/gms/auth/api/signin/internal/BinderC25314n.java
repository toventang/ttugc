package com.google.android.gms.auth.api.signin.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.n */
final class BinderC25314n extends BinderC25304d {

    /* renamed from: a */
    private final /* synthetic */ C25311k f60058a;

    static {
        Covode.recordClassIndex(30704);
    }

    BinderC25314n(C25311k kVar) {
        this.f60058a = kVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractC25317q, com.google.android.gms.auth.api.signin.internal.BinderC25304d
    /* renamed from: b */
    public final void mo41408b(Status status) {
        this.f60058a.mo41542a((AbstractC25485p) status);
    }
}
