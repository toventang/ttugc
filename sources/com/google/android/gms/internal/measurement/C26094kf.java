package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.kf */
public final class C26094kf implements AbstractC26095kg {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61427a;

    /* renamed from: b */
    private static final AbstractC25845bo<Long> f61428b;

    @Override // com.google.android.gms.internal.measurement.AbstractC26095kg
    /* renamed from: a */
    public final boolean mo42813a() {
        return f61427a.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26095kg
    /* renamed from: b */
    public final long mo42814b() {
        return f61428b.mo42200b().longValue();
    }

    static {
        Covode.recordClassIndex(31509);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61427a = byVar.mo42205a("measurement.sdk.attribution.cache", true);
        f61428b = byVar.mo42203a("measurement.sdk.attribution.cache.ttl", 604800000);
    }
}
