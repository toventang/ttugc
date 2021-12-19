package com.bytedance.tux.p1708b;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.tux.b.j */
public final class C22987j {

    /* renamed from: a */
    public final Map<Integer, C22978b> f54374a = new LinkedHashMap();

    /* renamed from: b */
    final Map<Integer, AbstractC89172b<C22985h, C89391z>> f54375b = new LinkedHashMap();

    /* renamed from: c */
    final Map<Integer, C22986i> f54376c = new LinkedHashMap();

    static {
        Covode.recordClassIndex(26904);
    }

    /* renamed from: a */
    public final C22987j mo37300a(int i, AbstractC89172b<? super C22985h, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        if (C22982f.f54340a) {
            this.f54375b.put(Integer.valueOf(i), bVar);
            return this;
        }
        C22985h hVar = new C22985h();
        bVar.invoke(hVar);
        this.f54374a.put(Integer.valueOf(i), hVar.mo37294a());
        return this;
    }

    /* renamed from: a */
    public final void mo37301a(int i, AbstractC89277c<?> cVar, boolean z) {
        C22986i iVar = new C22986i(i, cVar, z);
        this.f54376c.put(Integer.valueOf(iVar.f54371a), iVar);
        if (C22982f.f54340a) {
            this.f54376c.put(Integer.valueOf(i), iVar);
            return;
        }
        new C22985h();
        this.f54374a.put(Integer.valueOf(i), C22985h.m43353a(iVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.tux.b.j */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m43356a(C22987j jVar, int i, AbstractC89277c cVar, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            cVar = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        jVar.mo37301a(i, cVar, z);
    }
}
