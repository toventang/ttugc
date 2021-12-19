package com.bytedance.jedi.p1445a.p1460j;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20129c;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20137e;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20181b;
import com.bytedance.jedi.p1445a.p1459i.AbstractC20272a;
import com.bytedance.jedi.p1445a.p1461k.AbstractC20292c;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.j.c */
public abstract class AbstractC20288c {
    static {
        Covode.recordClassIndex(23796);
    }

    /* renamed from: a */
    public abstract <K, V, K1, V1> AbstractC20292c mo33647a(AbstractC20168e<K, V> eVar, AbstractC20168e<K1, V1> eVar2, AbstractC20272a<K, V, K1, V1> aVar);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.j.c$a */
    public static final class C20289a extends AbstractC89220m implements AbstractC89172b<AbstractC20272a.C20278c<K, V, K1, V1>, C89391z> {

        /* renamed from: a */
        public static final C20289a f48132a = new C20289a();

        static {
            Covode.recordClassIndex(23797);
        }

        C20289a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            C89219l.m154719c(obj, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final <K, V, K1, V1> AbstractC20292c mo33649a(AbstractC20129c<K, V> cVar, AbstractC20137e<K1, V1> eVar, AbstractC89172b<? super AbstractC20272a.C20281d<K, V, K1, List<V1>>, C89391z> bVar) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(bVar, "");
        AbstractC20168e<K, V> a = C20165b.m38137a(cVar);
        AbstractC20168e<K1, V1> a2 = C20165b.m38138a(eVar);
        AbstractC20272a.C20281d dVar = new AbstractC20272a.C20281d();
        bVar.invoke(dVar);
        return mo33647a(a, a2, dVar);
    }

    /* renamed from: b */
    public final <K, V, K1, V1> AbstractC20292c mo33652b(AbstractC20181b<K, V, ?, ?> bVar, AbstractC20137e<K1, V1> eVar, AbstractC89172b<? super AbstractC20272a.C20281d<K, V, K1, List<V1>>, C89391z> bVar2) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(bVar2, "");
        AbstractC20168e<K, V> a = C20165b.m38139a(bVar);
        AbstractC20168e<K1, V1> a2 = C20165b.m38138a(eVar);
        AbstractC20272a.C20281d dVar = new AbstractC20272a.C20281d();
        bVar2.invoke(dVar);
        return mo33647a(a, a2, dVar);
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC20292c m38482a(AbstractC20288c cVar, AbstractC20181b bVar, AbstractC20129c cVar2) {
        C20289a aVar = C20289a.f48132a;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(cVar2, "");
        C89219l.m154719c(aVar, "");
        AbstractC20168e a = C20165b.m38139a(bVar);
        AbstractC20168e a2 = C20165b.m38137a(cVar2);
        AbstractC20272a.C20278c cVar3 = new AbstractC20272a.C20278c();
        aVar.invoke(cVar3);
        return cVar.mo33647a(a, a2, cVar3);
    }

    /* renamed from: a */
    public final <K, V, K1, V1> AbstractC20292c mo33650a(AbstractC20137e<K, V> eVar, AbstractC20129c<K1, V1> cVar, AbstractC89172b<? super AbstractC20272a.C20273a<K, List<V>, K1, V1>, C89391z> bVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(bVar, "");
        AbstractC20168e<K, V> a = C20165b.m38138a(eVar);
        AbstractC20168e<K1, V1> a2 = C20165b.m38137a(cVar);
        AbstractC20272a.C20273a aVar = new AbstractC20272a.C20273a();
        bVar.invoke(aVar);
        return mo33647a(a, a2, aVar);
    }

    /* renamed from: a */
    public final <K, V, K1, V1> AbstractC20292c mo33651a(AbstractC20181b<K, V, ?, ?> bVar, AbstractC20137e<K1, V1> eVar, AbstractC89172b<? super AbstractC20272a.C20278c<K, V, K1, List<V1>>, C89391z> bVar2) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(bVar2, "");
        AbstractC20168e<K, V> a = C20165b.m38139a(bVar);
        AbstractC20168e<K1, V1> a2 = C20165b.m38138a(eVar);
        AbstractC20272a.C20278c cVar = new AbstractC20272a.C20278c();
        bVar2.invoke(cVar);
        return mo33647a(a, a2, cVar);
    }
}
