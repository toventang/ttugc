package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.m */
public final class C26142m extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ String f61527c;

    /* renamed from: d */
    private final /* synthetic */ C25939f f61528d;

    static {
        Covode.recordClassIndex(31557);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61528d.f61102h.setUserId(this.f61527c, this.f61105a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26142m(C25939f fVar, String str) {
        super(fVar);
        this.f61528d = fVar;
        this.f61527c = str;
    }
}
