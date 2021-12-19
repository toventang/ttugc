package com.bytedance.android.livesdk.usercard;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.usercard.ag */
final /* synthetic */ class C10950ag implements AbstractC88433f {

    /* renamed from: a */
    private final C10992x f26313a;

    static {
        Covode.recordClassIndex(12565);
    }

    C10950ag(C10992x xVar) {
        this.f26313a = xVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C10992x xVar = this.f26313a;
        Throwable th = (Throwable) obj;
        if (xVar.f26465b != null) {
            xVar.f26465b.mo17820a(th);
        }
    }
}
