package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.z */
public final class C26235z extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ String f61654c;

    /* renamed from: d */
    private final /* synthetic */ BinderC26218ov f61655d;

    /* renamed from: e */
    private final /* synthetic */ C25939f f61656e;

    static {
        Covode.recordClassIndex(31650);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: a */
    public final void mo42003a() {
        this.f61655d.mo42912a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61656e.f61102h.getMaxUserProperties(this.f61654c, this.f61655d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26235z(C25939f fVar, String str, BinderC26218ov ovVar) {
        super(fVar);
        this.f61656e = fVar;
        this.f61654c = str;
        this.f61655d = ovVar;
    }
}
