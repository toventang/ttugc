package com.bytedance.assem.arch.extensions;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.p795b.AbstractC12656g;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public final class AssembleExtKt$assemble$$inlined$let$lambda$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ AbstractC12656g f31073a;

    /* renamed from: b */
    final /* synthetic */ C89233z.C89238e f31074b;

    /* renamed from: c */
    final /* synthetic */ C12753e f31075c;

    /* renamed from: d */
    final /* synthetic */ Assembler f31076d;

    static {
        Covode.recordClassIndex(14600);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (C12782e.f31098a[aVar.ordinal()] == 1) {
            this.f31076d.mo20585d(this.f31073a);
        }
    }

    AssembleExtKt$assemble$$inlined$let$lambda$1(AbstractC12656g gVar, C89233z.C89238e eVar, C12753e eVar2, Assembler assembler) {
        this.f31073a = gVar;
        this.f31074b = eVar;
        this.f31075c = eVar2;
        this.f31076d = assembler;
    }
}
