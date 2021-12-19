package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.p */
public final class C26223p extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ String f61628c;

    /* renamed from: d */
    private final /* synthetic */ C25939f f61629d;

    static {
        Covode.recordClassIndex(31638);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61629d.f61102h.beginAdUnitExposure(this.f61628c, this.f61106b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26223p(C25939f fVar, String str) {
        super(fVar);
        this.f61629d = fVar;
        this.f61628c = str;
    }
}
