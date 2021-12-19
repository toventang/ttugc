package com.google.android.gms.internal.p1942authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.v */
final class C25700v extends AbstractC25702x<Status> {

    /* renamed from: e */
    private final /* synthetic */ Credential f60837e;

    static {
        Covode.recordClassIndex(31114);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public final /* synthetic */ AbstractC25485p mo41417a(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p1942authapi.AbstractC25702x
    /* renamed from: a */
    public final void mo41939a(AbstractC25678ad adVar) {
        adVar.mo41929a(new BinderC25703y(this), new zzz(this.f60837e));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25700v(AbstractC25357i iVar, Credential credential) {
        super(iVar);
        this.f60837e = credential;
    }
}
