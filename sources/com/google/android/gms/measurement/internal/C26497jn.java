package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.jn */
final class C26497jn extends AbstractC26429h {

    /* renamed from: b */
    private final /* synthetic */ C26498jo f62351b;

    /* renamed from: c */
    private final /* synthetic */ C26494jk f62352c;

    static {
        Covode.recordClassIndex(31919);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26429h
    /* renamed from: a */
    public final void mo43335a() {
        this.f62352c.mo43459e();
        this.f62352c.mo43016q().f61835k.mo43169a("Starting upload from DelayedRunnable");
        this.f62351b.mo43482i();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26497jn(C26494jk jkVar, AbstractC26404gb gbVar, C26498jo joVar) {
        super(gbVar);
        this.f62352c = jkVar;
        this.f62351b = joVar;
    }
}
