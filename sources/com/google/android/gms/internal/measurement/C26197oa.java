package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.oa */
public final class C26197oa implements AbstractC26198ob {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61606a;

    /* renamed from: b */
    private static final AbstractC25845bo<Long> f61607b;

    @Override // com.google.android.gms.internal.measurement.AbstractC26198ob
    /* renamed from: a */
    public final boolean mo42903a() {
        return f61606a.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31612);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61606a = byVar.mo42205a("measurement.service.ssaid_removal", true);
        f61607b = byVar.mo42203a("measurement.id.ssaid_removal", 0);
    }
}
