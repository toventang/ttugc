package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.lj */
public final class C26125lj implements AbstractC26121lf {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61507a;

    /* renamed from: b */
    private static final AbstractC25845bo<Boolean> f61508b;

    /* renamed from: c */
    private static final AbstractC25845bo<Boolean> f61509c;

    /* renamed from: d */
    private static final AbstractC25845bo<Boolean> f61510d;

    @Override // com.google.android.gms.internal.measurement.AbstractC26121lf
    /* renamed from: a */
    public final boolean mo42862a() {
        return f61507a.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26121lf
    /* renamed from: b */
    public final boolean mo42863b() {
        return f61508b.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26121lf
    /* renamed from: c */
    public final boolean mo42864c() {
        return f61509c.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26121lf
    /* renamed from: d */
    public final boolean mo42865d() {
        return f61510d.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31540);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61507a = byVar.mo42205a("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f61508b = byVar.mo42205a("measurement.audience.refresh_event_count_filters_timestamp", false);
        f61509c = byVar.mo42205a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f61510d = byVar.mo42205a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
