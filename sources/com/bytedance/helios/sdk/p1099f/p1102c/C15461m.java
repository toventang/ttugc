package com.bytedance.helios.sdk.p1099f.p1102c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.f.c.m */
public final class C15461m extends AbstractC15453f {
    static {
        Covode.recordClassIndex(17713);
    }

    @Override // com.bytedance.helios.sdk.p1099f.p1102c.AbstractC15453f
    /* renamed from: a */
    public final String mo25188a() {
        return "!=";
    }

    @Override // com.bytedance.helios.sdk.p1099f.p1102c.AbstractC15453f
    /* renamed from: b */
    public final int mo25189b() {
        return 400;
    }

    @Override // com.bytedance.helios.sdk.p1099f.p1102c.AbstractC15453f
    /* renamed from: a */
    public final Object mo25187a(Object obj, Object obj2) {
        boolean z;
        try {
            if ((obj instanceof Double) || (obj2 instanceof Double)) {
                if (Double.parseDouble(String.valueOf(obj)) != Double.parseDouble(String.valueOf(obj2))) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(!C89219l.m154714a((Object) String.valueOf(obj), (Object) String.valueOf(obj2)));
    }
}
