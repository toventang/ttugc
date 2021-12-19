package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25478k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.w */
final class C25473w implements AbstractC25478k.AbstractC25479a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f60464a;

    /* renamed from: b */
    private final /* synthetic */ C25441cv f60465b;

    static {
        Covode.recordClassIndex(30872);
    }

    @Override // com.google.android.gms.common.api.AbstractC25478k.AbstractC25479a
    /* renamed from: a */
    public final void mo41717a(Status status) {
        this.f60465b.f60385a.remove(this.f60464a);
    }

    C25473w(C25441cv cvVar, BasePendingResult basePendingResult) {
        this.f60465b = cvVar;
        this.f60464a = basePendingResult;
    }
}
