package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bz */
public final /* synthetic */ class C7163bz implements AbstractC88433f {

    /* renamed from: a */
    private final C7156bs f17850a;

    static {
        Covode.recordClassIndex(7909);
    }

    C7163bz(C7156bs bsVar) {
        this.f17850a = bsVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f17850a.finishWithFailure((Throwable) obj);
    }
}
