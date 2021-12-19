package com.bytedance.helios.sdk.p1099f.p1100a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.sdk.p1097d.AbstractC15412n;
import com.bytedance.helios.sdk.utils.C15484f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.f.a.a */
public final class C15437a implements AbstractC15438b {
    static {
        Covode.recordClassIndex(17689);
    }

    @Override // com.bytedance.helios.sdk.p1099f.p1100a.AbstractC15438b
    /* renamed from: a */
    public final boolean mo25182a(C15318n nVar) {
        C89219l.m154719c(nVar, "");
        if (nVar.f37362h || (nVar.f37374t == 1 && (!C89219l.m154714a((Object) nVar.f37363i, (Object) AbstractC15412n.f37629d[0])))) {
            nVar.f37375u.add("background");
            C15484f.m28491a("Helios-Control-Api", "BackgroundCondition id=" + nVar.f37356b + " startedTime=" + nVar.f37366l, (String) null, 12);
        }
        return nVar.f37362h;
    }
}
