package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.q */
public final class C26226q extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ BinderC26218ov f61630c;

    /* renamed from: d */
    private final /* synthetic */ C25939f f61631d;

    static {
        Covode.recordClassIndex(31641);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: a */
    public final void mo42003a() {
        this.f61630c.mo42912a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61631d.f61102h.getGmpAppId(this.f61630c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26226q(C25939f fVar, BinderC26218ov ovVar) {
        super(fVar);
        this.f61631d = fVar;
        this.f61630c = ovVar;
    }
}
