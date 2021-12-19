package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.mb */
public final class C26144mb implements AbstractC26140ly {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61531a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61532b;

    /* renamed from: c */
    private static final AbstractC25845bo<Boolean> f61533c;

    @Override // com.google.android.gms.internal.measurement.AbstractC26140ly
    /* renamed from: a */
    public final boolean mo42872a() {
        return f61531a.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31559);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61531a = byVar.mo42205a("measurement.client.sessions.check_on_reset_and_enable2", true);
        f61532b = byVar.mo42205a("measurement.client.sessions.check_on_startup", true);
        f61533c = byVar.mo42205a("measurement.client.sessions.start_session_before_view_screen", true);
    }
}
