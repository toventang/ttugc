package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.nu */
public final class C26190nu implements AbstractC26191nv {

    /* renamed from: a */
    private static final AbstractC25845bo<Boolean> f61599a = new C25855by(C25846bp.m50044a("com.google.android.gms.measurement")).mo42205a("measurement.experiment.enable_experiment_reporting", true);

    @Override // com.google.android.gms.internal.measurement.AbstractC26191nv
    /* renamed from: a */
    public final boolean mo42900a() {
        return f61599a.mo42200b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31605);
    }
}
