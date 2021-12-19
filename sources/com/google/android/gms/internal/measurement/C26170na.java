package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.na */
public final class C26170na implements AbstractC26166mx {

    /* renamed from: a */
    private static final AbstractC25845bo<Long> f61568a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61569b;

    /* renamed from: c */
    private static final AbstractC25845bo<Boolean> f61570c;

    /* renamed from: d */
    private static final AbstractC25845bo<Boolean> f61571d;

    /* renamed from: e */
    private static final AbstractC25845bo<Long> f61572e;

    @Override // com.google.android.gms.internal.measurement.AbstractC26166mx
    /* renamed from: a */
    public final boolean mo42886a() {
        return f61569b.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26166mx
    /* renamed from: b */
    public final boolean mo42887b() {
        return f61570c.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26166mx
    /* renamed from: c */
    public final boolean mo42888c() {
        return f61571d.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31585);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61568a = byVar.mo42203a("measurement.id.lifecycle.app_in_background_parameter", 0);
        f61569b = byVar.mo42205a("measurement.lifecycle.app_backgrounded_engagement", false);
        f61570c = byVar.mo42205a("measurement.lifecycle.app_backgrounded_tracking", true);
        f61571d = byVar.mo42205a("measurement.lifecycle.app_in_background_parameter", false);
        f61572e = byVar.mo42203a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }
}
