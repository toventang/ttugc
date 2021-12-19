package com.p2082ss.android.ugc.aweme.player.sdk.p3554c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84217p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.c.e */
public final class C63072e {
    static {
        Covode.recordClassIndex(73911);
    }

    /* renamed from: a */
    public static final boolean m113936a(C84217p pVar, C63064c cVar) {
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(cVar, "");
        if (cVar.f143293l != pVar.f188200n) {
            int i = cVar.f143293l;
            return false;
        } else if (pVar.f188147S == cVar.f143295n && pVar.f188148T == cVar.f143296o) {
            return true;
        } else {
            int intValue = ((Number) C84191b.f187906j.getValue()).intValue();
            int intValue2 = ((Number) C84191b.f187907k.getValue()).intValue();
            if (Math.abs(pVar.f188147S - cVar.f143295n) < intValue || Math.abs(pVar.f188148T - cVar.f143296o) < intValue2) {
                return false;
            }
            return true;
        }
    }
}
