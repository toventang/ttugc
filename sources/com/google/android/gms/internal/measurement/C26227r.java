package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.r */
public final class C26227r extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ String f61632c;

    /* renamed from: d */
    private final /* synthetic */ C25939f f61633d;

    static {
        Covode.recordClassIndex(31642);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61633d.f61102h.endAdUnitExposure(this.f61632c, this.f61106b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26227r(C25939f fVar, String str) {
        super(fVar);
        this.f61633d = fVar;
        this.f61632c = str;
    }
}
