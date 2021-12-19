package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.kq */
public final class C26105kq implements AbstractC26102kn {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61476a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61477b;

    @Override // com.google.android.gms.internal.measurement.AbstractC26102kn
    /* renamed from: a */
    public final boolean mo42850a() {
        return f61476a.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26102kn
    /* renamed from: b */
    public final boolean mo42851b() {
        return f61477b.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31520);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61476a = byVar.mo42205a("measurement.client.consent_state_v1.dev", false);
        f61477b = byVar.mo42205a("measurement.service.consent_state_v1", false);
    }
}
