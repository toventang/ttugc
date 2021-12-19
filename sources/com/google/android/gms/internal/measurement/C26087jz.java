package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.jz */
public final class C26087jz implements AbstractC26089ka {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61416a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61417b;

    @Override // com.google.android.gms.internal.measurement.AbstractC26089ka
    /* renamed from: a */
    public final boolean mo42811a() {
        return f61416a.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31502);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61416a = byVar.mo42205a("measurement.androidId.delete_feature", true);
        f61417b = byVar.mo42205a("measurement.log_androidId_enabled", false);
    }
}
