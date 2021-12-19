package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.chatroom.p488c.C7385d;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.af */
final /* synthetic */ class C6638af implements AbstractC88433f {

    /* renamed from: a */
    private final C6561ab f16533a;

    static {
        Covode.recordClassIndex(7376);
    }

    C6638af(C6561ab abVar) {
        this.f16533a = abVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C6561ab abVar = this.f16533a;
        C7385d dVar = (C7385d) obj;
        if (abVar.f16397d != null && abVar.f16398e != null) {
            abVar.f16398e.mo13578a(dVar.f18307a);
        }
    }
}
