package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.d */
public final class C45693d {
    static {
        Covode.recordClassIndex(54208);
    }

    /* renamed from: a */
    public static final C45690c m88194a(C45694e eVar) {
        C89219l.m154721d(eVar, "");
        Map<String, C45690c> map = eVar.f106410a;
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, C45690c> entry : map.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return (C45690c) C89070n.m154583g((List) arrayList);
    }
}
