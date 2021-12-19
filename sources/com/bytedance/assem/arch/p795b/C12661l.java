package com.bytedance.assem.arch.p795b;

import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.b.l */
public final class C12661l {
    static {
        Covode.recordClassIndex(14481);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ASSEM extends com.bytedance.assem.arch.b.u<? extends com.bytedance.tiktok.proxy.d> & com.bytedance.assem.arch.b.i<ITEM> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <ITEM, ASSEM extends AbstractC12693u<? extends AbstractC22876d> & AbstractC12658i<ITEM>> ITEM m22797a(ASSEM assem) {
        C89219l.m154719c(assem, "");
        AbstractC12659j jVar = assem.f30901n;
        if (jVar != null) {
            return (ITEM) jVar.mo20471a();
        }
        return null;
    }

    /* renamed from: b */
    public static final int m22798b(AbstractC12693u<? extends AbstractC22876d> uVar) {
        AbstractC89171a<Integer> c;
        Integer invoke;
        C89219l.m154719c(uVar, "");
        AbstractC12659j jVar = uVar.f30901n;
        if (jVar == null || (c = jVar.mo20476c()) == null || (invoke = c.invoke()) == null) {
            return -1;
        }
        return invoke.intValue();
    }
}
