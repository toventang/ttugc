package com.bytedance.assem.arch.p795b;

import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.b.e */
public final class C12654e extends AbstractC12663n {

    /* renamed from: a */
    public static final C12654e f30815a = new C12654e();

    private C12654e() {
    }

    static {
        Covode.recordClassIndex(14474);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12663n
    /* renamed from: a */
    public final AbstractC12663n mo20462a(EnumC12650a aVar) {
        C89219l.m154719c(aVar, "");
        int i = C12655f.f30816a[aVar.ordinal()];
        if (i == 1) {
            return C12664o.f30818a;
        }
        if (i == 2) {
            return f30815a;
        }
        if (i != 3) {
            if (i != 4) {
                return this;
            }
            return C12734y.f30958a;
        } else if (C12787j.f31109c) {
            return f30815a;
        } else {
            return C12664o.f30818a;
        }
    }
}
