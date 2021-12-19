package com.bytedance.assem.arch.service;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public final class AssemServiceExtKt$setAssemServiceState$3 implements AbstractC1192f {

    /* renamed from: a */
    final /* synthetic */ ActivityC0945e f31128a;

    /* renamed from: b */
    final /* synthetic */ C89233z.C89238e f31129b;

    /* renamed from: c */
    final /* synthetic */ Assembler f31130c;

    static {
        Covode.recordClassIndex(14626);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (C12806e.f31144a[aVar.ordinal()] == 1) {
            if (this.f31128a instanceof AbstractC12800c) {
                T t = this.f31129b.element;
                AbstractC12800c cVar = (AbstractC12800c) this.f31128a;
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
                            t.mo20615b(cls3, cVar);
                        }
                        cls = cls.getSuperclass();
                        if (cls == null) {
                            break;
                        }
                    }
                }
            }
            this.f31130c.mo20585d(this.f31128a);
        }
    }
}
