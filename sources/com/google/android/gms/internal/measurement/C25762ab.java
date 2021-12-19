package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.ab */
public final class C25762ab extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ boolean f60883c;

    /* renamed from: d */
    private final /* synthetic */ C25939f f60884d;

    static {
        Covode.recordClassIndex(31177);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f60884d.f61102h.setDataCollectionEnabled(this.f60883c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25762ab(C25939f fVar, boolean z) {
        super(fVar);
        this.f60884d = fVar;
        this.f60883c = z;
    }
}
