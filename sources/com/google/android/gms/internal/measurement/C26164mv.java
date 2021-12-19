package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.mv */
public final class C26164mv implements AbstractC26165mw {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61557a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61558b;

    /* renamed from: c */
    private static final AbstractC25845bo<Boolean> f61559c;

    /* renamed from: d */
    private static final AbstractC25845bo<Boolean> f61560d;

    /* renamed from: e */
    private static final AbstractC25845bo<Long> f61561e;

    @Override // com.google.android.gms.internal.measurement.AbstractC26165mw
    /* renamed from: a */
    public final boolean mo42882a() {
        return f61557a.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26165mw
    /* renamed from: b */
    public final boolean mo42883b() {
        return f61558b.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26165mw
    /* renamed from: c */
    public final boolean mo42884c() {
        return f61559c.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26165mw
    /* renamed from: d */
    public final boolean mo42885d() {
        return f61560d.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31579);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61557a = byVar.mo42205a("measurement.sdk.collection.enable_extend_user_property_size", true);
        f61558b = byVar.mo42205a("measurement.sdk.collection.last_deep_link_referrer2", true);
        f61559c = byVar.mo42205a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f61560d = byVar.mo42205a("measurement.sdk.collection.last_gclid_from_referrer2", false);
        f61561e = byVar.mo42203a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }
}
