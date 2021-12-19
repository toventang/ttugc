package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.av */
final /* synthetic */ class C7104av implements AbstractC88433f {

    /* renamed from: a */
    private final C7103au f17709a;

    static {
        Covode.recordClassIndex(7850);
    }

    C7104av(C7103au auVar) {
        this.f17709a = auVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7103au auVar = this.f17709a;
        if (auVar.f17707a != null) {
            auVar.f17707a.dismiss();
        }
    }
}
