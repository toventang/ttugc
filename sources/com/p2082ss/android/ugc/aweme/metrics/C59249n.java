package com.p2082ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.metrics.n */
public final class C59249n extends AbstractC59233c<C59249n> {
    static {
        Covode.recordClassIndex(69612);
    }

    public C59249n() {
        super("enter_new_collection_creation");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        if (this.f135169h != null) {
            mo96786a("enter_from", this.f135169h);
        }
    }

    /* renamed from: a */
    public final C59249n mo96820a(String str) {
        this.f135169h = str;
        return this;
    }
}
