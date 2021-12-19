package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s */
public final class C26228s extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ BinderC26218ov f61634c;

    /* renamed from: d */
    private final /* synthetic */ C25939f f61635d;

    static {
        Covode.recordClassIndex(31643);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: a */
    public final void mo42003a() {
        this.f61634c.mo42912a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61635d.f61102h.generateEventId(this.f61634c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26228s(C25939f fVar, BinderC26218ov ovVar) {
        super(fVar);
        this.f61635d = fVar;
        this.f61634c = ovVar;
    }
}
