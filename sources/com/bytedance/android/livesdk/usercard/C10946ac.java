package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.usercard.ac */
final /* synthetic */ class C10946ac implements AbstractC88433f {

    /* renamed from: a */
    private final C10992x f26309a;

    static {
        Covode.recordClassIndex(12561);
    }

    C10946ac(C10992x xVar) {
        this.f26309a = xVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C10992x xVar = this.f26309a;
        C11688a aVar = (C11688a) obj;
        xVar.f26466c = false;
        if (xVar.f26465b != null) {
            xVar.f26465b.mo17819a(aVar);
        }
    }
}
