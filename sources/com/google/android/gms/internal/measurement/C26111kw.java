package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.kw */
public final class C26111kw implements AbstractC26108kt {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61486a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61487b;

    /* renamed from: c */
    private static final AbstractC25845bo<Boolean> f61488c;

    /* renamed from: d */
    private static final AbstractC25845bo<Boolean> f61489d;

    /* renamed from: e */
    private static final AbstractC25845bo<Boolean> f61490e;

    /* renamed from: f */
    private static final AbstractC25845bo<Boolean> f61491f;

    @Override // com.google.android.gms.internal.measurement.AbstractC26108kt
    /* renamed from: a */
    public final boolean mo42853a() {
        return f61486a.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26108kt
    /* renamed from: b */
    public final boolean mo42854b() {
        return f61487b.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26108kt
    /* renamed from: c */
    public final boolean mo42855c() {
        return f61488c.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26108kt
    /* renamed from: d */
    public final boolean mo42856d() {
        return f61489d.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26108kt
    /* renamed from: e */
    public final boolean mo42857e() {
        return f61490e.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26108kt
    /* renamed from: f */
    public final boolean mo42858f() {
        return f61491f.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31526);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61486a = byVar.mo42205a("measurement.gold.enhanced_ecommerce.format_logs", true);
        f61487b = byVar.mo42205a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        f61488c = byVar.mo42205a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        f61489d = byVar.mo42205a("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        f61490e = byVar.mo42205a("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        f61491f = byVar.mo42205a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
    }
}
