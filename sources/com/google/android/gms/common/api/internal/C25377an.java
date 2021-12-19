package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.internal.C25446d;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.an */
public final class C25377an implements AbstractC25383at {

    /* renamed from: a */
    private final C25386aw f60210a;

    static {
        Covode.recordClassIndex(30776);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41565a(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41566a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41567a(ConnectionResult connectionResult, C25335a<?> aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: b */
    public final boolean mo41572b() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final void mo41564a() {
        for (C25335a.AbstractC25343f fVar : this.f60210a.f60246f.values()) {
            fVar.mo41491f();
        }
        this.f60210a.f60253m.f60216e = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: c */
    public final void mo41574c() {
        C25386aw awVar = this.f60210a;
        awVar.f60241a.lock();
        try {
            awVar.f60251k = new C25368ae(awVar, awVar.f60248h, awVar.f60249i, awVar.f60244d, awVar.f60250j, awVar.f60241a, awVar.f60243c);
            awVar.f60251k.mo41564a();
            awVar.f60242b.signalAll();
        } finally {
            awVar.f60241a.unlock();
        }
    }

    public C25377an(C25386aw awVar) {
        this.f60210a = awVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: b */
    public final <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T mo41569b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25383at
    /* renamed from: a */
    public final <A extends C25335a.AbstractC25337b, R extends AbstractC25485p, T extends C25446d.AbstractC25447a<R, A>> T mo41563a(T t) {
        this.f60210a.f60253m.f60214c.add(t);
        return t;
    }
}
