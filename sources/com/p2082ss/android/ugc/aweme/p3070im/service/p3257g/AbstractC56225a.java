package com.p2082ss.android.ugc.aweme.p3070im.service.p3257g;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.service.g.a */
public abstract class AbstractC56225a {

    /* renamed from: f */
    public final Map<String, Object> f128224f;

    /* renamed from: g */
    public final Map<String, Object> f128225g;

    /* renamed from: h */
    public final Map<String, Object> f128226h;

    static {
        Covode.recordClassIndex(66034);
    }

    public AbstractC56225a() {
        this(null, null, null, 7);
    }

    private AbstractC56225a(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(map2, "");
        C89219l.m154721d(map3, "");
        this.f128224f = map;
        this.f128225g = map2;
        this.f128226h = map3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC56225a(Map map, Map map2, Map map3, int i) {
        this((i & 1) != 0 ? C89041ag.m154415a() : map, (i & 2) != 0 ? C89041ag.m154415a() : map2, (i & 4) != 0 ? C89041ag.m154415a() : map3);
    }
}
