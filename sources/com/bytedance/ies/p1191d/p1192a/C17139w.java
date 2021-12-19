package com.bytedance.ies.p1191d.p1192a;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.C89309k;

/* renamed from: com.bytedance.ies.d.a.w */
public final class C17139w implements AbstractC17121j {

    /* renamed from: a */
    public final AbstractC17128o f40753a;

    /* renamed from: b */
    private final AbstractC17113e f40754b;

    /* renamed from: c */
    private final AbstractC17116h f40755c;

    /* renamed from: d */
    private final Map<String, AbstractC89171a<Boolean>> f40756d;

    /* renamed from: e */
    private final List<AbstractC17129p> f40757e;

    static {
        Covode.recordClassIndex(19596);
    }

    /* renamed from: com.bytedance.ies.d.a.w$a */
    static final class C17142a extends AbstractC89220m implements AbstractC89172b<AbstractC17129p, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f40761a;

        static {
            Covode.recordClassIndex(19599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17142a(String str) {
            super(1);
            this.f40761a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC17129p pVar) {
            AbstractC17129p pVar2 = pVar;
            C89219l.m154719c(pVar2, "");
            return Boolean.valueOf(pVar2.mo27041b());
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17121j
    /* renamed from: b */
    public final List<C17144y> mo27035b(String str) {
        C89219l.m154719c(str, "");
        System.currentTimeMillis();
        return this.f40753a.mo26990a(str, this.f40755c);
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17121j
    /* renamed from: a */
    public final void mo27033a(String str) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str, "");
        C17130q.m31653a("Start prefetch, page scheme: ".concat(String.valueOf(str)));
        List<AbstractC17129p> list = this.f40757e;
        if (list != null) {
            Iterator a = C89309k.m154799a(C89070n.m154598r(list), (AbstractC89172b) new C17142a(str)).mo2926a();
            String str2 = str;
            while (a.hasNext()) {
                str2 = ((AbstractC17129p) a.next()).mo27040a();
                C17130q.m31655b("Scheme convert to [schema:" + str2 + "], origin_scheme:" + str);
            }
            str = str2;
        }
        C17100aj ajVar = new C17100aj(str);
        C89378p<Collection<C17091ad>, SortedMap<String, String>> a2 = this.f40754b.mo27014a(ajVar);
        if (a2 == null) {
            C17130q.m31654a("No config found for page " + str + ", skipping...", null);
        } else {
            m31661a(str, a2.getFirst(), a2.getSecond(), ajVar.mo27012c());
        }
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17121j
    /* renamed from: a */
    public final C17144y mo27032a(C17147z zVar, AbstractC17083aa aaVar) {
        C89219l.m154719c(zVar, "");
        C89219l.m154719c(aaVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        C17144y a = this.f40753a.mo26989a(zVar);
        a.f40769d = currentTimeMillis;
        a.f40767b = this.f40755c;
        return a;
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17121j
    /* renamed from: b */
    public final C17144y mo27034b(C17147z zVar, AbstractC17083aa aaVar) {
        C89219l.m154719c(zVar, "");
        C89219l.m154719c(aaVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        C17144y b = this.f40753a.mo26995b(zVar);
        b.f40769d = currentTimeMillis;
        b.f40767b = this.f40755c;
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f A[EDGE_INSN: B:23:0x005f->B:15:0x005f ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m31661a(java.lang.String r12, java.util.Collection<com.bytedance.ies.p1191d.p1192a.C17091ad> r13, java.util.SortedMap<java.lang.String, java.lang.String> r14, java.util.SortedMap<java.lang.String, java.lang.String> r15) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1191d.p1192a.C17139w.m31661a(java.lang.String, java.util.Collection, java.util.SortedMap, java.util.SortedMap):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends h.f.a.a<java.lang.Boolean>> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.bytedance.ies.d.a.p> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17139w(AbstractC17128o oVar, AbstractC17113e eVar, AbstractC17116h hVar, Map<String, ? extends AbstractC89171a<Boolean>> map, List<? extends AbstractC17129p> list, final WeakReference<AbstractC89171a<C89391z>> weakReference) {
        C89219l.m154719c(oVar, "");
        C89219l.m154719c(eVar, "");
        this.f40753a = oVar;
        this.f40754b = eVar;
        this.f40755c = hVar;
        this.f40756d = map;
        this.f40757e = list;
        eVar.mo27015a(new AbstractC89171a<C89391z>(this) {
            /* class com.bytedance.ies.p1191d.p1192a.C17139w.C171401 */

            /* renamed from: a */
            final /* synthetic */ C17139w f40758a;

            static {
                Covode.recordClassIndex(19597);
            }

            {
                this.f40758a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f40758a.f40753a.mo26993a(new AbstractC89171a<C89391z>(this) {
                    /* class com.bytedance.ies.p1191d.p1192a.C17139w.C171401.C171411 */

                    /* renamed from: a */
                    final /* synthetic */ C171401 f40760a;

                    static {
                        Covode.recordClassIndex(19598);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        AbstractC89171a aVar;
                        WeakReference weakReference = weakReference;
                        if (!(weakReference == null || (aVar = (AbstractC89171a) weakReference.get()) == null)) {
                            aVar.invoke();
                        }
                        return C89391z.f203057a;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f40760a = r1;
                    }
                });
                return C89391z.f203057a;
            }
        });
    }
}
