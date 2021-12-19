package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.ng */
public final class C26176ng implements AbstractC26173nd {

    /* renamed from: a */
    private static final AbstractC25845bo<Long> f61579a;

    /* renamed from: b */
    private static final AbstractC25845bo<Long> f61580b;

    @Override // com.google.android.gms.internal.measurement.AbstractC26173nd
    /* renamed from: a */
    public final long mo42891a() {
        return f61580b.mo42200b().longValue();
    }

    static {
        Covode.recordClassIndex(31591);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61579a = byVar.mo42203a("measurement.id.max_bundles_per_iteration", 0);
        f61580b = byVar.mo42203a("measurement.max_bundles_per_iteration", 2);
    }
}
