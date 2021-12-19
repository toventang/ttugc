package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.kl */
public final class C26100kl implements AbstractC26101km {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61469a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61470b;

    /* renamed from: c */
    private static final AbstractC25845bo<Long> f61471c;

    @Override // com.google.android.gms.internal.measurement.AbstractC26101km
    /* renamed from: a */
    public final boolean mo42848a() {
        return f61469a.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26101km
    /* renamed from: b */
    public final boolean mo42849b() {
        return f61470b.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31515);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61469a = byVar.mo42205a("measurement.service.configurable_service_limits", true);
        f61470b = byVar.mo42205a("measurement.client.configurable_service_limits", true);
        f61471c = byVar.mo42203a("measurement.id.service.configurable_service_limits", 0);
    }
}
