package com.bytedance.assem.arch.p795b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.b.c */
public final class C12652c extends AbstractC12663n {

    /* renamed from: a */
    public static final C12652c f30813a = new C12652c();

    private C12652c() {
    }

    static {
        Covode.recordClassIndex(14472);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12663n
    /* renamed from: a */
    public final AbstractC12663n mo20462a(EnumC12650a aVar) {
        C89219l.m154719c(aVar, "");
        int i = C12653d.f30814a[aVar.ordinal()];
        if (i == 1) {
            return this;
        }
        if (i == 2 || i == 3) {
            return C12734y.f30958a;
        }
        if (i != 4) {
            return this;
        }
        return C12664o.f30818a;
    }
}
