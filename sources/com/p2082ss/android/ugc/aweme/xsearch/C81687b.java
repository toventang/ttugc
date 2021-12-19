package com.p2082ss.android.ugc.aweme.xsearch;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.p2054c.C28725c;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.b */
public final class C81687b {

    /* renamed from: a */
    private final LynxBaseUI f182645a;

    /* renamed from: b */
    private final Set<String> f182646b;

    static {
        Covode.recordClassIndex(95091);
    }

    public C81687b(LynxBaseUI lynxBaseUI, Set<String> set) {
        C89219l.m154721d(lynxBaseUI, "");
        C89219l.m154721d(set, "");
        this.f182645a = lynxBaseUI;
        this.f182646b = set;
    }

    /* renamed from: a */
    public static /* synthetic */ void m141550a(C81687b bVar, String str, Map map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        if (bVar.f182646b.contains(str)) {
            AbstractC28520j jVar = bVar.f182645a.mContext;
            C89219l.m154716b(jVar, "");
            C28719c cVar = jVar.f67064e;
            C28725c cVar2 = new C28725c(bVar.f182645a.getSign(), str);
            for (Map.Entry entry : map.entrySet()) {
                cVar2.mo49838a((String) entry.getKey(), entry.getValue());
            }
            cVar.mo49834a(cVar2);
        }
    }
}
