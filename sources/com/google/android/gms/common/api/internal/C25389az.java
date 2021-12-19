package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C25417c;

/* renamed from: com.google.android.gms.common.api.internal.az */
final class C25389az implements ComponentCallbacks2C25417c.AbstractC25418a {

    /* renamed from: a */
    private final /* synthetic */ C25450f f60258a;

    static {
        Covode.recordClassIndex(30788);
    }

    C25389az(C25450f fVar) {
        this.f60258a = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C25417c.AbstractC25418a
    /* renamed from: a */
    public final void mo41610a(boolean z) {
        this.f60258a.f60418o.sendMessage(this.f60258a.f60418o.obtainMessage(1, Boolean.valueOf(z)));
    }
}
