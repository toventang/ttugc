package com.bytedance.ies.xbridge.platform.p1352b.p1354b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18687l;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.b.b.b */
public final class C18826b implements AbstractC18687l {

    /* renamed from: a */
    private final Iterator<String> f44633a;

    static {
        Covode.recordClassIndex(21522);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18687l
    /* renamed from: a */
    public final boolean mo29723a() {
        return this.f44633a.hasNext();
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18687l
    /* renamed from: b */
    public final String mo29724b() {
        return this.f44633a.next();
    }

    public C18826b(Iterator<String> it) {
        C89219l.m154719c(it, "");
        this.f44633a = it;
    }
}
