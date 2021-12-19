package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.aa */
public final class C25761aa extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ BinderC26218ov f60881c;

    /* renamed from: d */
    private final /* synthetic */ C25939f f60882d;

    static {
        Covode.recordClassIndex(31176);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: a */
    public final void mo42003a() {
        this.f60881c.mo42912a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f60882d.f61102h.getAppInstanceId(this.f60881c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25761aa(C25939f fVar, BinderC26218ov ovVar) {
        super(fVar);
        this.f60882d = fVar;
        this.f60881c = ovVar;
    }
}
