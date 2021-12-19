package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.api.internal.av */
abstract class AbstractC25385av {

    /* renamed from: a */
    private final AbstractC25383at f60240a;

    static {
        Covode.recordClassIndex(30784);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41561a();

    protected AbstractC25385av(AbstractC25383at atVar) {
        this.f60240a = atVar;
    }

    /* renamed from: a */
    public final void mo41595a(C25386aw awVar) {
        awVar.f60241a.lock();
        try {
            if (awVar.f60251k == this.f60240a) {
                mo41561a();
                awVar.f60241a.unlock();
            }
        } finally {
            awVar.f60241a.unlock();
        }
    }
}
