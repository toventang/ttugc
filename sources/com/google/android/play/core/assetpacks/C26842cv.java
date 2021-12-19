package com.google.android.play.core.assetpacks;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.AbstractC27059a;

/* renamed from: com.google.android.play.core.assetpacks.cv */
final /* synthetic */ class C26842cv implements AbstractC27059a {

    /* renamed from: a */
    static final AbstractC27059a f63682a = new C26842cv();

    static {
        Covode.recordClassIndex(32317);
    }

    private C26842cv() {
    }

    @Override // com.google.android.play.core.tasks.AbstractC27059a
    /* renamed from: a */
    public final void mo35008a(Exception exc) {
        C26843cw.f63683a.mo44599e(C1764a.m5928a("Could not sync active asset packs. %s", new Object[]{exc}), new Object[0]);
    }
}
