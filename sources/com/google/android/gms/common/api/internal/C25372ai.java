package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.ai */
final class C25372ai extends AbstractC25385av {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f60202a;

    /* renamed from: b */
    private final /* synthetic */ C25369af f60203b;

    static {
        Covode.recordClassIndex(30771);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25385av
    /* renamed from: a */
    public final void mo41561a() {
        this.f60203b.f60196a.mo41570b(this.f60202a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25372ai(C25369af afVar, AbstractC25383at atVar, ConnectionResult connectionResult) {
        super(atVar);
        this.f60203b = afVar;
        this.f60202a = connectionResult;
    }
}
