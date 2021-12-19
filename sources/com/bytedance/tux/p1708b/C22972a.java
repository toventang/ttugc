package com.bytedance.tux.p1708b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.b.a */
public final class C22972a {

    /* renamed from: a */
    private Map<Integer, C22978b> f54323a;

    /* renamed from: b */
    private Map<Integer, ? extends AbstractC89172b<? super C22985h, C89391z>> f54324b;

    /* renamed from: c */
    private Map<Integer, C22978b> f54325c = new LinkedHashMap();

    /* renamed from: d */
    private Map<Integer, C22986i> f54326d;

    /* renamed from: e */
    private final AbstractC89172b<C22987j, C89391z> f54327e;

    static {
        Covode.recordClassIndex(26889);
    }

    /* renamed from: b */
    private synchronized void m43308b() {
        MethodCollector.m26663i(9193);
        if (this.f54324b == null) {
            C22987j jVar = new C22987j();
            this.f54327e.invoke(jVar);
            C89378p a = C89387v.m154943a(jVar.f54375b, jVar.f54376c);
            this.f54324b = (Map) a.getFirst();
            this.f54326d = (Map) a.getSecond();
        }
        MethodCollector.m26664o(9193);
    }

    /* renamed from: a */
    public final synchronized Map<Integer, C22978b> mo37287a() {
        MethodCollector.m26663i(9196);
        Map<Integer, C22978b> map = this.f54323a;
        if (map != null) {
            MethodCollector.m26664o(9196);
            return map;
        }
        C22987j jVar = new C22987j();
        this.f54327e.invoke(jVar);
        Map<Integer, C22978b> map2 = jVar.f54374a;
        this.f54323a = map2;
        MethodCollector.m26664o(9196);
        return map2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.bytedance.tux.b.j, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C22972a(AbstractC89172b<? super C22987j, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        this.f54327e = bVar;
    }

    /* renamed from: a */
    public final synchronized C22978b mo37286a(int i) {
        C22986i iVar;
        AbstractC89172b bVar;
        C22978b bVar2;
        MethodCollector.m26663i(9195);
        m43308b();
        Map<Integer, C22978b> map = this.f54325c;
        C22978b bVar3 = null;
        if (map == null || (bVar2 = map.get(Integer.valueOf(i))) == null) {
            Map<Integer, ? extends AbstractC89172b<? super C22985h, C89391z>> map2 = this.f54324b;
            if (map2 == null || (bVar = (AbstractC89172b) map2.get(Integer.valueOf(i))) == null) {
                Map<Integer, C22986i> map3 = this.f54326d;
                if (!(map3 == null || (iVar = map3.get(Integer.valueOf(i))) == null)) {
                    new C22985h();
                    C22978b a = C22985h.m43353a(iVar);
                    this.f54325c.put(Integer.valueOf(i), a);
                    MethodCollector.m26664o(9195);
                    return a;
                }
            } else {
                C22985h hVar = new C22985h();
                bVar.invoke(hVar);
                C22978b a2 = hVar.mo37294a();
                this.f54325c.put(Integer.valueOf(i), a2);
                MethodCollector.m26664o(9195);
                return a2;
            }
        } else {
            bVar3 = bVar2;
        }
        MethodCollector.m26664o(9195);
        return bVar3;
    }
}
