package com.bytedance.bpea.core;

import com.bytedance.bpea.core.p868a.AbstractC13354a;
import com.bytedance.bpea.core.p868a.C13355b;
import com.bytedance.bpea.core.p868a.EnumC13357d;
import com.bytedance.bpea.core.p870c.AbstractC13367e;
import com.bytedance.bpea.core.p870c.C13362b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.a */
public final class C13353a {

    /* renamed from: a */
    public static final C13353a f32634a = new C13353a();

    private C13353a() {
    }

    static {
        Covode.recordClassIndex(15349);
    }

    /* renamed from: a */
    public static final void m24032a(AbstractC13367e eVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(eVar, "");
        if (!C13362b.f32657a.contains(eVar)) {
            C13362b.f32657a.add(eVar);
        }
    }

    /* renamed from: a */
    public static final void m24031a(EnumC13357d dVar, AbstractC13354a aVar) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(dVar, "");
        List<AbstractC13354a> list = C13355b.f32635a.get(dVar);
        if (list == null || list.isEmpty()) {
            list = new ArrayList<>();
            C13355b.f32635a.put(dVar, list);
        }
        if (!list.contains(aVar)) {
            list.add(aVar);
        }
    }
}
