package com.bytedance.assem.arch.extensions;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class AssembleExtKt$assemble$3 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ AbstractC12766p f31083a;

    /* renamed from: b */
    final /* synthetic */ Assembler f31084b;

    static {
        Covode.recordClassIndex(14603);
    }

    AssembleExtKt$assemble$3(AbstractC12766p pVar, Assembler assembler) {
        this.f31083a = pVar;
        this.f31084b = assembler;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (C12782e.f31099b[aVar.ordinal()] == 1) {
            this.f31084b.mo20585d(this.f31083a);
        }
    }
}
