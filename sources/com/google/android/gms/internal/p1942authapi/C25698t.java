package com.google.android.gms.internal.p1942authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.AbstractC25266b;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.t */
final class C25698t extends AbstractC25702x<AbstractC25266b> {

    /* renamed from: e */
    private final /* synthetic */ CredentialRequest f60836e;

    static {
        Covode.recordClassIndex(31112);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public final /* synthetic */ AbstractC25485p mo41417a(Status status) {
        return C25696r.m49625a(status);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p1942authapi.AbstractC25702x
    /* renamed from: a */
    public final void mo41939a(AbstractC25678ad adVar) {
        adVar.mo41928a(new BinderC25701w(this), this.f60836e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25698t(AbstractC25357i iVar, CredentialRequest credentialRequest) {
        super(iVar);
        this.f60836e = credentialRequest;
    }
}
