package com.bytedance.tux.p1708b;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.tux.b.h */
public final class C22985h extends C22980d {

    /* renamed from: b */
    private final Map<C22981e, Map<Integer, Object>> f54370b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(26902);
    }

    @Override // com.bytedance.tux.p1708b.C22980d
    /* renamed from: a */
    public final C22978b mo37294a() {
        if (this.f54370b.isEmpty()) {
            return super.mo37294a();
        }
        return new C22978b(this.f54333a, this.f54370b);
    }

    /* renamed from: a */
    public static C22978b m43353a(C22986i iVar) {
        C89219l.m154719c(iVar, "");
        C22985h hVar = new C22985h();
        Boolean valueOf = Boolean.valueOf(iVar.f54373c);
        if (valueOf.booleanValue()) {
            boolean booleanValue = valueOf.booleanValue();
            C22979c<Boolean> r = C22983g.m43344r();
            hVar.f54333a.put(Integer.valueOf(r.f54332a), Boolean.valueOf(booleanValue));
        }
        AbstractC89277c<?> cVar = iVar.f54372b;
        if (cVar != null) {
            hVar.f54333a.put(Integer.valueOf(C22983g.m43345s().f54332a), cVar);
        }
        return hVar.mo37294a();
    }

    /* renamed from: a */
    public final void mo37296a(C22981e eVar, AbstractC89172b<? super C22980d, C89391z> bVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(bVar, "");
        C22980d dVar = new C22980d();
        bVar.invoke(dVar);
        this.f54370b.put(eVar, dVar.mo37294a().f54330a);
    }
}
