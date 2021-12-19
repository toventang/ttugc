package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.by */
public final class C25415by implements AbstractC25419ca {

    /* renamed from: a */
    private final /* synthetic */ C25416bz f60305a;

    static {
        Covode.recordClassIndex(30814);
    }

    C25415by(C25416bz bzVar) {
        this.f60305a = bzVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25419ca
    /* renamed from: a */
    public final void mo41636a(BasePendingResult<?> basePendingResult) {
        this.f60305a.f60308c.remove(basePendingResult);
        basePendingResult.mo41545c();
    }
}
