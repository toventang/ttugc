package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.nb */
public final class C26171nb implements AbstractC26172nc {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61573a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61574b;

    @Override // com.google.android.gms.internal.measurement.AbstractC26172nc
    /* renamed from: a */
    public final boolean mo42889a() {
        return f61573a.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26172nc
    /* renamed from: b */
    public final boolean mo42890b() {
        return f61574b.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31586);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61573a = byVar.mo42205a("measurement.sdk.screen.manual_screen_view_logging", true);
        f61574b = byVar.mo42205a("measurement.sdk.screen.disabling_automatic_reporting", true);
    }
}
