package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.b */
public abstract class AbstractC44706b extends AbstractC44713g {
    static {
        Covode.recordClassIndex(53092);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.track.AbstractC45535a
    /* renamed from: a */
    public final HashMap<String, Object> mo73987a() {
        return C89041ag.m154428c(C89387v.m154943a("module_name", "discounts"));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC44706b(String str) {
        super(str);
        C89219l.m154721d(str, "");
    }

    /* renamed from: a */
    public final AbstractC44706b mo75847a(String str) {
        if (str != null) {
            this.f106050k.put("coupon_type_id", str);
        }
        return this;
    }

    /* renamed from: b */
    public final AbstractC44706b mo75849b(String str) {
        if (str != null) {
            this.f106050k.put("coupon_id", str);
        }
        return this;
    }

    /* renamed from: c */
    public final AbstractC44706b mo75851c(String str) {
        if (str != null) {
            this.f106050k.put("coupon_name", str);
        }
        return this;
    }

    /* renamed from: a */
    public final AbstractC44706b mo75848a(Map<String, ? extends Object> map) {
        C89219l.m154721d(map, "");
        this.f106050k.putAll(map);
        return this;
    }

    /* renamed from: b */
    public final void mo75850b(Map<String, ? extends Object> map) {
        C89219l.m154721d(map, "");
        this.f106050k.putAll(map);
    }
}
