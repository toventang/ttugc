package com.bytedance.ies.bullet.p1129c.p1132c.p1133a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16188n;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16194r;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.a.i */
public final class C16178i implements AbstractC16188n {

    /* renamed from: a */
    public static final C16179a f38959a = new C16179a((byte) 0);

    /* renamed from: b */
    private AbstractC89172b<? super AbstractC16192q, C89391z> f38960b;

    /* renamed from: c */
    private final String f38961c;

    /* renamed from: d */
    private final Map<String, AbstractC16188n> f38962d;

    /* renamed from: e */
    private final Map<String, AbstractC16192q> f38963e;

    static {
        Covode.recordClassIndex(18471);
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.i$a */
    public static final class C16179a {
        static {
            Covode.recordClassIndex(18472);
        }

        private C16179a() {
        }

        public /* synthetic */ C16179a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC16188n m30044a(AbstractC16190o oVar, C16248b bVar) {
            C89219l.m154719c(oVar, "");
            C89219l.m154719c(bVar, "");
            String a = oVar.mo25749a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : oVar.mo25750b().invoke(bVar)) {
                linkedHashMap.put(t.mo25749a(), m30044a(t, bVar));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T t2 : oVar.mo25751c().invoke(bVar)) {
                linkedHashMap2.put(t2.mo25752d(), t2);
            }
            return new C16178i(a, linkedHashMap, linkedHashMap2, (byte) 0);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16188n
    /* renamed from: b */
    public final String mo25743b() {
        return this.f38961c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16188n
    /* renamed from: c */
    public final Map<String, AbstractC16188n> mo25744c() {
        return this.f38962d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16188n
    /* renamed from: d */
    public final Map<String, AbstractC16192q> mo25745d() {
        return this.f38963e;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        for (Map.Entry<String, AbstractC16188n> entry : this.f38962d.entrySet()) {
            entry.getValue().mo25721a();
        }
        for (Map.Entry<String, AbstractC16192q> entry2 : this.f38963e.entrySet()) {
            entry2.getValue().mo25721a();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16188n
    /* renamed from: a */
    public final void mo25741a(AbstractC89183m<? super List<? extends AbstractC16188n>, ? super AbstractC16192q, C89391z> mVar) {
        C89219l.m154719c(mVar, "");
        for (Map.Entry<String, AbstractC16188n> entry : this.f38962d.entrySet()) {
            entry.getValue().mo25741a(new C16180b(this, mVar));
        }
        for (Map.Entry<String, AbstractC16192q> entry2 : this.f38963e.entrySet()) {
            mVar.invoke(C89070n.m154516a(this), entry2.getValue());
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.i$b */
    static final class C16180b extends AbstractC89220m implements AbstractC89183m<List<? extends AbstractC16188n>, AbstractC16192q, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16178i f38964a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f38965b;

        static {
            Covode.recordClassIndex(18473);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16180b(C16178i iVar, AbstractC89183m mVar) {
            super(2);
            this.f38964a = iVar;
            this.f38965b = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(List<? extends AbstractC16188n> list, AbstractC16192q qVar) {
            List<? extends AbstractC16188n> list2 = list;
            C89219l.m154719c(list2, "");
            C89219l.m154719c(qVar, "");
            AbstractC89183m mVar = this.f38965b;
            List c = C89070n.m154524c(this.f38964a);
            c.addAll(list2);
            mVar.invoke(c, qVar);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16188n
    /* renamed from: a */
    public final void mo25740a(AbstractC16188n nVar, boolean z) {
        C89219l.m154719c(nVar, "");
        for (Map.Entry<String, AbstractC16192q> entry : nVar.mo25745d().entrySet()) {
            if (!this.f38963e.containsKey(entry.getKey())) {
                this.f38963e.put(entry.getKey(), entry.getValue());
            } else if (z) {
                AbstractC16192q qVar = this.f38963e.get(entry.getKey());
                if (qVar != null) {
                    qVar.mo25721a();
                }
                this.f38963e.put(entry.getKey(), entry.getValue());
            } else {
                entry.getValue().mo25721a();
            }
        }
        for (Map.Entry<String, AbstractC16188n> entry2 : nVar.mo25744c().entrySet()) {
            if (this.f38962d.containsKey(entry2.getKey())) {
                AbstractC16188n nVar2 = this.f38962d.get(entry2.getKey());
                if (nVar2 != null) {
                    nVar2.mo25740a(entry2.getValue(), z);
                }
            } else {
                this.f38962d.put(entry2.getKey(), entry2.getValue());
            }
        }
    }

    private C16178i(String str, Map<String, AbstractC16188n> map, Map<String, AbstractC16192q> map2) {
        this.f38961c = str;
        this.f38962d = map;
        this.f38963e = map2;
    }

    public /* synthetic */ C16178i(String str, Map map, Map map2, byte b) {
        this(str, map, map2);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16188n
    /* renamed from: a */
    public final void mo25742a(List<String> list, Object obj, AbstractC16192q.AbstractC16193a aVar, AbstractC89172b<? super Throwable, C89391z> bVar) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(obj, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(bVar, "");
        int size = list.size();
        if (size == 0) {
            bVar.invoke(new AbstractC16188n.C16189a("[unknown]"));
        } else if (size != 1) {
            String str = (String) C89070n.m154579f((List) list);
            AbstractC16188n nVar = this.f38962d.get(str);
            if (nVar == null) {
                bVar.invoke(new AbstractC16188n.C16189a(str));
                return;
            }
            this.f38960b = this.f38960b;
            nVar.mo25742a(list.subList(1, list.size()), obj, aVar, bVar);
        } else {
            String str2 = (String) C89070n.m154579f((List) list);
            AbstractC16192q qVar = this.f38963e.get(str2);
            if (qVar == null) {
                bVar.invoke(new AbstractC16188n.C16189a(str2));
            } else if (qVar instanceof AbstractC16183k) {
                AbstractC89172b<? super AbstractC16192q, C89391z> bVar2 = this.f38960b;
                if (bVar2 != null) {
                    bVar2.invoke(qVar);
                }
                ((AbstractC16183k) qVar).mo25748a((JSONObject) obj, (AbstractC16183k.AbstractC16185b) aVar);
            } else if (qVar instanceof AbstractC16194r) {
                AbstractC89172b<? super AbstractC16192q, C89391z> bVar3 = this.f38960b;
                if (bVar3 != null) {
                    bVar3.invoke(qVar);
                }
                AbstractC16194r rVar = (AbstractC16194r) qVar;
                if (rVar != null) {
                    C16165f.m30014a(rVar, obj, (AbstractC16194r.AbstractC16195a) aVar);
                }
            }
        }
    }
}
