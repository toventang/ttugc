package com.bytedance.lynx.hybrid.resource.p1530f;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.C21314g;
import com.bytedance.lynx.hybrid.resource.C21335j;
import com.bytedance.lynx.hybrid.resource.C21337l;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.EnumC21280f;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.p1525a.C21230a;
import com.bytedance.lynx.hybrid.resource.p1526b.C21235a;
import com.bytedance.lynx.hybrid.resource.p1526b.C21238b;
import com.bytedance.lynx.hybrid.resource.p1526b.C21249e;
import com.bytedance.lynx.hybrid.resource.p1526b.C21264g;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.resource.p1528d.C21297g;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.f.b */
public final class C21309b {

    /* renamed from: a */
    public static final C21309b f50583a = new C21309b();

    /* renamed from: b */
    private static final List<EnumC21280f> f50584b = C89070n.m154524c(EnumC21280f.GECKO, EnumC21280f.BUILTIN, EnumC21280f.CDN);

    private C21309b() {
    }

    static {
        Covode.recordClassIndex(24927);
    }

    /* renamed from: a */
    public static C21311d m40023a(C21314g gVar, C21297g gVar2) {
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(gVar2, "");
        C21284j jVar = gVar2.f50561c;
        ArrayList arrayList = new ArrayList();
        if (C21230a.f50388a != null) {
            Class<? extends IHybridResourceLoader> cls = C21230a.f50388a;
            if (cls == null) {
                C89219l.m154707a();
            }
            arrayList.add(cls);
        }
        List<? extends Class<? extends IHybridResourceLoader>> list = jVar.f50511b.f50489b;
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.addAll(C21337l.f50672a);
        if (gVar2.f50560b instanceof C21335j) {
            C21294e eVar = gVar2.f50560b;
            if (eVar == null) {
                throw new C89388w("null cannot be cast to non-null type");
            } else if (((C21335j) eVar).f50666h) {
                arrayList.add(C21264g.class);
            }
        }
        if (jVar.f50511b.f50488a.isEmpty() && !jVar.f50511b.f50492e) {
            jVar.f50511b.mo34878a(f50584b);
        }
        for (EnumC21280f fVar : jVar.f50511b.f50488a) {
            int i = C21310c.f50585a[fVar.ordinal()];
            if (i == 1) {
                arrayList.add(C21249e.class);
            } else if (i == 2) {
                arrayList.add(C21235a.class);
            } else if (i == 3) {
                arrayList.add(C21238b.class);
            }
        }
        arrayList.addAll(C21337l.f50673b);
        List<? extends Class<? extends IHybridResourceLoader>> list2 = jVar.f50511b.f50490c;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        List<? extends Class<? extends IHybridResourceLoader>> list3 = jVar.f50511b.f50491d;
        if (list3 != null) {
            arrayList.removeAll(list3);
        }
        return new C21311d(arrayList, gVar);
    }
}
