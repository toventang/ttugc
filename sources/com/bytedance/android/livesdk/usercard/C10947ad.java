package com.bytedance.android.livesdk.usercard;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.usercard.ad */
final /* synthetic */ class C10947ad implements AbstractC88433f {

    /* renamed from: a */
    private final C10992x f26310a;

    static {
        Covode.recordClassIndex(12562);
    }

    C10947ad(C10992x xVar) {
        this.f26310a = xVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C10992x xVar = this.f26310a;
        Throwable th = (Throwable) obj;
        xVar.f26466c = false;
        if (xVar.f26465b != null) {
            xVar.f26465b.mo17820a(th);
        }
    }
}
