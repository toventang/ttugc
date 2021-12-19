package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.n */
public final class C26169n extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ boolean f61566c;

    /* renamed from: d */
    private final /* synthetic */ C25939f f61567d;

    static {
        Covode.recordClassIndex(31584);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61567d.f61102h.setMeasurementEnabled(this.f61566c, this.f61105a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26169n(C25939f fVar, boolean z) {
        super(fVar);
        this.f61567d = fVar;
        this.f61566c = z;
    }
}
