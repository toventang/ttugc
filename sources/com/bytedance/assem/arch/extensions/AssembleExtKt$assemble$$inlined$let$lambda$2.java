package com.bytedance.assem.arch.extensions;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.service.AbstractC12800c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

public final class AssembleExtKt$assemble$$inlined$let$lambda$2 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ C12753e f31077a;

    /* renamed from: b */
    final /* synthetic */ Fragment f31078b;

    /* renamed from: c */
    final /* synthetic */ Assembler f31079c;

    static {
        Covode.recordClassIndex(14601);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (C12782e.f31100c[aVar.ordinal()] == 1) {
            Fragment fragment = this.f31078b;
            if (fragment instanceof AbstractC12800c) {
                C12753e eVar = this.f31077a;
                AbstractC12800c cVar = (AbstractC12800c) fragment;
                Class<?> cls = cVar.getClass();
                Class<?>[] interfaces = cls.getInterfaces();
                if (interfaces != null && interfaces.length != 0) {
                    while (cls != Object.class) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        C89219l.m154709a((Object) interfaces2, "");
                        ArrayList<Class<?>> arrayList = new ArrayList();
                        for (Class<?> cls2 : interfaces2) {
                            if (AbstractC12800c.class.isAssignableFrom(cls2)) {
                                arrayList.add(cls2);
                            }
                        }
                        for (Class<?> cls3 : arrayList) {
                            C89219l.m154709a((Object) cls3, "");
                            eVar.mo20615b(cls3, cVar);
                        }
                        cls = cls.getSuperclass();
                        if (cls == null) {
                            break;
                        }
                    }
                }
            }
            this.f31079c.mo20585d(this.f31078b);
        }
    }

    AssembleExtKt$assemble$$inlined$let$lambda$2(C12753e eVar, Fragment fragment, Assembler assembler) {
        this.f31077a = eVar;
        this.f31078b = fragment;
        this.f31079c = assembler;
    }
}
