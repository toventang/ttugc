package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.au */
public final class C25384au extends AbstractC25398bh {

    /* renamed from: a */
    private WeakReference<C25380aq> f60239a;

    static {
        Covode.recordClassIndex(30783);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25398bh
    /* renamed from: a */
    public final void mo41594a() {
        C25380aq aqVar = this.f60239a.get();
        if (aqVar != null) {
            C25380aq.m48854a(aqVar);
        }
    }

    C25384au(C25380aq aqVar) {
        this.f60239a = new WeakReference<>(aqVar);
    }
}
