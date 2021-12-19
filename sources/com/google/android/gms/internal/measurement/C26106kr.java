package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.kr */
public final class C26106kr implements AbstractC26107ks {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61478a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61479b;

    /* renamed from: c */
    private static final AbstractC25845bo<Boolean> f61480c;

    /* renamed from: d */
    private static final AbstractC25845bo<Long> f61481d;

    @Override // com.google.android.gms.internal.measurement.AbstractC26107ks
    /* renamed from: a */
    public final boolean mo42852a() {
        return f61478a.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31521);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61478a = byVar.mo42205a("measurement.sdk.dynamite.allow_remote_dynamite2", false);
        f61479b = byVar.mo42205a("measurement.collection.init_params_control_enabled", true);
        f61480c = byVar.mo42205a("measurement.sdk.dynamite.use_dynamite3", true);
        f61481d = byVar.mo42203a("measurement.id.sdk.dynamite.use_dynamite", 0);
    }
}
