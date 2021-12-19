package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.mp */
public final class C26158mp implements AbstractC26159mq {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61548a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61549b;

    /* renamed from: c */
    private static final AbstractC25845bo<Boolean> f61550c;

    /* renamed from: d */
    private static final AbstractC25845bo<Long> f61551d;

    @Override // com.google.android.gms.internal.measurement.AbstractC26159mq
    /* renamed from: a */
    public final boolean mo42878a() {
        return f61548a.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26159mq
    /* renamed from: b */
    public final boolean mo42879b() {
        return f61549b.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26159mq
    /* renamed from: c */
    public final boolean mo42880c() {
        return f61550c.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31573);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61548a = byVar.mo42205a("measurement.client.global_params.dev", false);
        f61549b = byVar.mo42205a("measurement.service.global_params_in_payload", true);
        f61550c = byVar.mo42205a("measurement.service.global_params", false);
        f61551d = byVar.mo42203a("measurement.id.service.global_params", 0);
    }
}
