package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.android.gms.common.api.internal.cm */
public final class C25432cm implements AbstractC25357i.AbstractC25359b, AbstractC25357i.AbstractC25360c {

    /* renamed from: a */
    public final C25335a<?> f60342a;

    /* renamed from: b */
    public AbstractC25434co f60343b;

    /* renamed from: c */
    private final boolean f60344c;

    static {
        Covode.recordClassIndex(30831);
    }

    /* renamed from: a */
    private final void m49008a() {
        C25565r.m49315a(this.f60343b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: a */
    public final void mo34348a(Bundle bundle) {
        m49008a();
        this.f60343b.mo34348a(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: b */
    public final void mo34349b(int i) {
        m49008a();
        this.f60343b.mo34349b(i);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25462m
    /* renamed from: a */
    public final void mo41581a(ConnectionResult connectionResult) {
        m49008a();
        this.f60343b.mo41599a(connectionResult, this.f60342a, this.f60344c);
    }

    public C25432cm(C25335a<?> aVar, boolean z) {
        this.f60342a = aVar;
        this.f60344c = z;
    }
}
