package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.mi */
public final class C26151mi implements AbstractC26147me {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61539a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61540b;

    /* renamed from: c */
    private static final AbstractC25845bo<Long> f61541c;

    @Override // com.google.android.gms.internal.measurement.AbstractC26147me
    /* renamed from: a */
    public final boolean mo42874a() {
        return f61539a.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26147me
    /* renamed from: b */
    public final boolean mo42875b() {
        return f61540b.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31566);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61539a = byVar.mo42205a("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f61540b = byVar.mo42205a("measurement.collection.redundant_engagement_removal_enabled", false);
        f61541c = byVar.mo42203a("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }
}
