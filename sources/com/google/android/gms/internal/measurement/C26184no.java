package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.no */
public final class C26184no implements AbstractC26185np {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61589a;

    /* renamed from: b */
    private static final AbstractC25845bo<Double> f61590b;

    /* renamed from: c */
    private static final AbstractC25845bo<Long> f61591c;

    /* renamed from: d */
    private static final AbstractC25845bo<Long> f61592d;

    /* renamed from: e */
    private static final AbstractC25845bo<String> f61593e;

    @Override // com.google.android.gms.internal.measurement.AbstractC26185np
    /* renamed from: a */
    public final boolean mo42894a() {
        return f61589a.mo42200b().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26185np
    /* renamed from: b */
    public final double mo42895b() {
        return f61590b.mo42200b().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26185np
    /* renamed from: c */
    public final long mo42896c() {
        return f61591c.mo42200b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26185np
    /* renamed from: d */
    public final long mo42897d() {
        return f61592d.mo42200b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26185np
    /* renamed from: e */
    public final String mo42898e() {
        return f61593e.mo42200b();
    }

    static {
        Covode.recordClassIndex(31599);
        C25855by byVar = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement"));
        f61589a = byVar.mo42205a("measurement.test.boolean_flag", false);
        f61590b = new C25853bw(byVar, "measurement.test.double_flag", Double.valueOf(-3.0d));
        f61591c = byVar.mo42203a("measurement.test.int_flag", -2);
        f61592d = byVar.mo42203a("measurement.test.long_flag", -1);
        f61593e = byVar.mo42204a("measurement.test.string_flag", "---");
    }
}
