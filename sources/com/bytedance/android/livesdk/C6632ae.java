package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.p571m.C9461f;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.ae */
final /* synthetic */ class C6632ae implements AbstractC88433f {

    /* renamed from: a */
    private final C6561ab f16526a;

    static {
        Covode.recordClassIndex(7370);
    }

    C6632ae(C6561ab abVar) {
        this.f16526a = abVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C6561ab abVar = this.f16526a;
        C9461f fVar = (C9461f) obj;
        try {
            if (abVar.f16401i.mo14904c(abVar.f16401i.mo14898a() - 1).getId() == fVar.f23002a) {
                return;
            }
        } catch (Exception unused) {
            if (fVar == null) {
                return;
            }
        }
        if (abVar.f16401i != null) {
            abVar.f16401i.mo14901a(fVar.f23002a);
        }
    }
}
