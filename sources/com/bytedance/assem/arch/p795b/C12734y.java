package com.bytedance.assem.arch.p795b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.b.y */
public final class C12734y extends AbstractC12663n {

    /* renamed from: a */
    public static final C12734y f30958a = new C12734y();

    private C12734y() {
    }

    static {
        Covode.recordClassIndex(14554);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12663n
    /* renamed from: a */
    public final AbstractC12663n mo20462a(EnumC12650a aVar) {
        C89219l.m154719c(aVar, "");
        int i = C12735z.f30959a[aVar.ordinal()];
        if (i == 1) {
            return C12652c.f30813a;
        }
        if (i == 2) {
            return this;
        }
        if (i != 3) {
            return this;
        }
        return C12654e.f30815a;
    }
}
