package com.bytedance.android.live.broadcast.p199h;

import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.h.d */
final /* synthetic */ class C3246d implements AbstractC88433f {

    /* renamed from: a */
    private final C3244b f9301a;

    static {
        Covode.recordClassIndex(3727);
    }

    C3246d(C3244b bVar) {
        this.f9301a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C3244b bVar = this.f9301a;
        Throwable th = (Throwable) obj;
        if (th instanceof C2912a) {
            bVar.f9297a.mo8530a(((C2908a) th).getErrorCode());
        }
        bVar.f9297a.mo8530a(0);
    }
}
