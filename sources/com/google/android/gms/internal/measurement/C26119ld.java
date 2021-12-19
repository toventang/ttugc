package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.ld */
public final class C26119ld implements AbstractC26120le {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61502a = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement")).mo42205a("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.AbstractC26120le
    /* renamed from: a */
    public final boolean mo42861a() {
        return f61502a.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31534);
    }
}
