package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25939f;

/* renamed from: com.google.android.gms.internal.measurement.k */
public final class C26088k extends C25939f.AbstractRunnableC25940a {

    /* renamed from: c */
    private final /* synthetic */ String f61418c;

    /* renamed from: d */
    private final /* synthetic */ String f61419d;

    /* renamed from: e */
    private final /* synthetic */ Bundle f61420e;

    /* renamed from: f */
    private final /* synthetic */ C25939f f61421f;

    static {
        Covode.recordClassIndex(31503);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C25939f.AbstractRunnableC25940a
    /* renamed from: b */
    public final void mo42004b() {
        this.f61421f.f61102h.clearConditionalUserProperty(this.f61418c, this.f61419d, this.f61420e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26088k(C25939f fVar, String str, String str2, Bundle bundle) {
        super(fVar);
        this.f61421f = fVar;
        this.f61418c = str;
        this.f61419d = str2;
        this.f61420e = bundle;
    }
}
