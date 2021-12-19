package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.j */
public final class C26057j extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ String f61364c;

    /* renamed from: d */
    private final /* synthetic */ String f61365d;

    /* renamed from: e */
    private final /* synthetic */ BinderC26218ov f61366e;

    /* renamed from: f */
    private final /* synthetic */ C25939f f61367f;

    static {
        Covode.recordClassIndex(31472);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: a */
    public final void mo42003a() {
        this.f61366e.mo42912a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61367f.f61102h.getConditionalUserProperties(this.f61364c, this.f61365d, this.f61366e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26057j(C25939f fVar, String str, String str2, BinderC26218ov ovVar) {
        super(fVar);
        this.f61367f = fVar;
        this.f61364c = str;
        this.f61365d = str2;
        this.f61366e = ovVar;
    }
}
