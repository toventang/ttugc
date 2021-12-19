package com.google.android.gms.internal.p1942authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC25455h;
import com.google.android.gms.common.api.internal.C25470t;
import com.google.android.gms.p1940d.C25632i;

/* renamed from: com.google.android.gms.internal.auth-api.i */
final class BinderC25687i extends AbstractC25455h.AbstractBinderC25456a {

    /* renamed from: a */
    private final /* synthetic */ C25632i f60819a;

    static {
        Covode.recordClassIndex(31101);
    }

    BinderC25687i(C25632i iVar) {
        this.f60819a = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25455h
    /* renamed from: a */
    public final void mo41709a(Status status) {
        C25470t.m49133a(status, null, this.f60819a);
    }
}
