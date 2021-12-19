package com.bytedance.ies.xbridge.model.p1339a.p1340a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18687l;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.model.a.a.b */
public final class C18736b implements AbstractC18687l {

    /* renamed from: a */
    private final Iterator<String> f44521a;

    static {
        Covode.recordClassIndex(21430);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18687l
    /* renamed from: a */
    public final boolean mo29723a() {
        return this.f44521a.hasNext();
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18687l
    /* renamed from: b */
    public final String mo29724b() {
        return this.f44521a.next();
    }

    public C18736b(Iterator<String> it) {
        C89219l.m154719c(it, "");
        this.f44521a = it;
    }
}
