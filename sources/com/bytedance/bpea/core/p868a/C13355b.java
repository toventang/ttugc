package com.bytedance.bpea.core.p868a;

import com.bytedance.bpea.basics.C13345f;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.a.b */
public final class C13355b {

    /* renamed from: a */
    public static final Map<EnumC13357d, List<AbstractC13354a>> f32635a = new LinkedHashMap();

    /* renamed from: b */
    public static final C13355b f32636b = new C13355b();

    private C13355b() {
    }

    static {
        Covode.recordClassIndex(15351);
    }

    /* renamed from: a */
    public static EnumC13356c m24035a(C13345f fVar, EnumC13357d dVar) {
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(dVar, "");
        List<AbstractC13354a> list = f32635a.get(dVar);
        if (list != null) {
            for (T t : list) {
                if (t.mo21598a(fVar)) {
                    return t.mo21599b(fVar);
                }
            }
        }
        return EnumC13356c.NOTHING;
    }
}
