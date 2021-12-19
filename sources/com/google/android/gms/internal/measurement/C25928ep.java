package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.ep */
final class C25928ep extends AbstractC25923el {

    /* renamed from: a */
    private final C25927eo f61081a = new C25927eo();

    static {
        Covode.recordClassIndex(31343);
    }

    C25928ep() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25923el
    /* renamed from: a */
    public final void mo42349a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.f61081a.mo42352a(th).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
