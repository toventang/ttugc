package com.google.android.gms.auth.api.signin.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.k */
public final class C25311k extends AbstractC25313m<Status> {
    static {
        Covode.recordClassIndex(30701);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public final /* synthetic */ AbstractC25485p mo41417a(Status status) {
        return status;
    }

    public C25311k(AbstractC25357i iVar) {
        super(iVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    @Override // com.google.android.gms.common.api.internal.C25446d.AbstractC25447a
    /* renamed from: a */
    public final /* synthetic */ void mo41418a(C25307g gVar) {
        C25307g gVar2 = gVar;
        ((AbstractC25319s) gVar2.mo41794q()).mo41426b(new BinderC25314n(this), gVar2.f60055a);
    }
}
