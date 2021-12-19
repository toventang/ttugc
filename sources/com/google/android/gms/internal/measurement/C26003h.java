package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.h */
public final class C26003h extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ Bundle f61278c;

    /* renamed from: d */
    private final /* synthetic */ C25939f f61279d;

    static {
        Covode.recordClassIndex(31418);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61279d.f61102h.setConditionalUserProperty(this.f61278c, this.f61105a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26003h(C25939f fVar, Bundle bundle) {
        super(fVar);
        this.f61279d = fVar;
        this.f61278c = bundle;
    }
}
