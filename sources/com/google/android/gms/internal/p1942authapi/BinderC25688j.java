package com.google.android.gms.internal.p1942authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25470t;
import com.google.android.gms.p1940d.C25632i;

/* renamed from: com.google.android.gms.internal.auth-api.j */
final class BinderC25688j extends AbstractBinderC25680b {

    /* renamed from: a */
    private final /* synthetic */ C25632i f60820a;

    static {
        Covode.recordClassIndex(31102);
    }

    BinderC25688j(C25632i iVar) {
        this.f60820a = iVar;
    }

    @Override // com.google.android.gms.internal.p1942authapi.AbstractC25674a
    /* renamed from: a */
    public final void mo41924a(Status status, BeginSignInResult beginSignInResult) {
        C25470t.m49133a(status, beginSignInResult, this.f60820a);
    }
}
