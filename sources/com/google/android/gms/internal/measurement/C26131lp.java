package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.lp */
public final class C26131lp implements AbstractC26128lm {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61516a;

    /* renamed from: b */
    private static final AbstractC25845bo<Long> f61517b;

    @Override // com.google.android.gms.internal.measurement.AbstractC26128lm
    /* renamed from: a */
    public final boolean mo42868a() {
        return f61516a.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31546);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61516a = byVar.mo42205a("measurement.sdk.referrer.delayed_install_referrer_api", false);
        f61517b = byVar.mo42203a("measurement.id.sdk.referrer.delayed_install_referrer_api", 0);
    }
}
