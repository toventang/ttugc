package com.bytedance.ies.xbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.C18513f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.xbridge.d */
public abstract class AbstractC18469d {
    static {
        Covode.recordClassIndex(21163);
    }

    /* renamed from: a */
    public abstract EnumC18483e mo29617a();

    /* renamed from: a */
    public final void mo29618a(String str, AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, C18513f fVar) {
        AbstractC18400b a;
        C89219l.m154719c(str, "");
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(fVar, "");
        if (C89361p.m154874b(str, "x.", false)) {
            C89219l.m154719c(str, "");
            C18513f.C18514a a2 = fVar.mo29640a();
            C89219l.m154719c(str, "");
            AbstractC18467c cVar = a2.f44171a.get(str);
            if (cVar != null && (a = cVar.mo13408a()) != null) {
                a.mo7340a(nVar, bVar, mo29617a());
            }
        }
    }
}
