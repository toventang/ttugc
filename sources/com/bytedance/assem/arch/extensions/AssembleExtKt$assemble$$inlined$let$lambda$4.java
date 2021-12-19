package com.bytedance.assem.arch.extensions;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.service.AbstractC12800c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

public final class AssembleExtKt$assemble$$inlined$let$lambda$4 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ C12753e f31080a;

    /* renamed from: b */
    final /* synthetic */ ActivityC0945e f31081b;

    /* renamed from: c */
    final /* synthetic */ Assembler f31082c;

    static {
        Covode.recordClassIndex(14602);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (C12782e.f31101d[aVar.ordinal()] == 1) {
            ActivityC0945e eVar = this.f31081b;
            if (eVar instanceof AbstractC12800c) {
                C12753e eVar2 = this.f31080a;
                AbstractC12800c cVar = (AbstractC12800c) eVar;
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
                            eVar2.mo20615b(cls3, cVar);
                        }
                        cls = cls.getSuperclass();
                        if (cls == null) {
                            break;
                        }
                    }
                }
            }
            this.f31082c.mo20585d(this.f31081b);
        }
    }

    public AssembleExtKt$assemble$$inlined$let$lambda$4(C12753e eVar, ActivityC0945e eVar2, Assembler assembler) {
        this.f31080a = eVar;
        this.f31081b = eVar2;
        this.f31082c = assembler;
    }
}
