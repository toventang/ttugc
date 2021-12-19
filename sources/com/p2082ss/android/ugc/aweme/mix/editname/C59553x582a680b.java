package com.p2082ss.android.ugc.aweme.mix.editname;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.service.AbstractC12800c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.mix.editname.EditPlayListNameFragment$$special$$inlined$setAssemServiceState$1 */
public final class C59553x582a680b implements AbstractC1192f {

    /* renamed from: a */
    final /* synthetic */ Fragment f135905a;

    /* renamed from: b */
    final /* synthetic */ C89233z.C89238e f135906b;

    /* renamed from: c */
    final /* synthetic */ Assembler f135907c;

    static {
        Covode.recordClassIndex(69950);
    }

    public C59553x582a680b(Fragment fragment, C89233z.C89238e eVar, Assembler assembler) {
        this.f135905a = fragment;
        this.f135906b = eVar;
        this.f135907c = assembler;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (C59618i.f135986a[aVar.ordinal()] == 1) {
            T t = this.f135906b.element;
            AbstractC12800c cVar = (AbstractC12800c) this.f135905a;
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
            this.f135907c.mo20585d(this.f135905a);
        }
    }
}
