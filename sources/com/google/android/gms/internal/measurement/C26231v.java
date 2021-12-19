package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.v */
public final class C26231v extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ BinderC26218ov f61640c;

    /* renamed from: d */
    private final /* synthetic */ C25939f f61641d;

    static {
        Covode.recordClassIndex(31646);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: a */
    public final void mo42003a() {
        this.f61640c.mo42912a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61641d.f61102h.getCurrentScreenName(this.f61640c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26231v(C25939f fVar, BinderC26218ov ovVar) {
        super(fVar);
        this.f61641d = fVar;
        this.f61640c = ovVar;
    }
}
