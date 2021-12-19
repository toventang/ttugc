package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.t */
public final class C26229t extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ BinderC26218ov f61636c;

    /* renamed from: d */
    private final /* synthetic */ C25939f f61637d;

    static {
        Covode.recordClassIndex(31644);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: a */
    public final void mo42003a() {
        this.f61636c.mo42912a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61637d.f61102h.getCachedAppInstanceId(this.f61636c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26229t(C25939f fVar, BinderC26218ov ovVar) {
        super(fVar);
        this.f61637d = fVar;
        this.f61636c = ovVar;
    }
}
