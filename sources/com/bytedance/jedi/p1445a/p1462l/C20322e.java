package com.bytedance.jedi.p1445a.p1462l;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.l.e */
public final class C20322e<T> implements AbstractC20319b<T> {

    /* renamed from: a */
    public static final C20323a f48169a = new C20323a((byte) 0);

    /* renamed from: b */
    private T f48170b;

    /* renamed from: c */
    private final LinkedHashSet<C89378p<AbstractC20318a<?>, Long>> f48171c;

    static {
        Covode.recordClassIndex(23830);
    }

    /* renamed from: com.bytedance.jedi.a.l.e$a */
    public static final class C20323a {
        static {
            Covode.recordClassIndex(23831);
        }

        private C20323a() {
        }

        public /* synthetic */ C20323a(byte b) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ AbstractC20319b m38510a(Object obj) {
            return m38511a(obj, new C20322e(obj, new LinkedHashSet(), (byte) 0));
        }

        /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.bytedance.jedi.a.l.b<V>, com.bytedance.jedi.a.l.b<T> */
        /* renamed from: a */
        public static <T> AbstractC20319b<T> m38511a(T t, AbstractC20319b<?> bVar) {
            C89219l.m154719c(bVar, "");
            return (AbstractC20319b<V>) bVar.mo33654a((Object) t);
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20319b
    /* renamed from: a */
    public final T mo33655a() {
        return this.f48170b;
    }

    @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20319b
    /* renamed from: b */
    public final C89378p<AbstractC20318a<?>, Long> mo33657b() {
        LinkedHashSet<C89378p<AbstractC20318a<?>, Long>> linkedHashSet = this.f48171c;
        if (!linkedHashSet.isEmpty()) {
            return (C89378p) C89070n.m154570d((Iterable) linkedHashSet);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.p[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20319b
    /* renamed from: a */
    public final <V> AbstractC20319b<V> mo33654a(V v) {
        if (C89219l.m154714a((Object) this.f48170b, (Object) v)) {
            return this;
        }
        int size = this.f48171c.size();
        C89378p[] pVarArr = new C89378p[size];
        for (int i = 0; i < size; i++) {
            pVarArr[i] = C89070n.m154560b(this.f48171c, i);
        }
        C89219l.m154721d(pVarArr, "");
        return new C20322e(v, (LinkedHashSet) C89064i.m154496b((Object[]) pVarArr, (Collection) new LinkedHashSet(C89041ag.m154411a(size))));
    }

    @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20319b
    /* renamed from: b */
    public final boolean mo33658b(AbstractC20318a<T> aVar) {
        C89219l.m154719c(aVar, "");
        return this.f48171c.add(C89387v.m154943a(aVar, Long.valueOf(System.currentTimeMillis())));
    }

    @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20319b
    /* renamed from: a */
    public final boolean mo33656a(AbstractC20318a<?> aVar) {
        C89219l.m154719c(aVar, "");
        LinkedHashSet<C89378p<AbstractC20318a<?>, Long>> linkedHashSet = this.f48171c;
        ArrayList arrayList = new ArrayList(C89070n.m154526a(linkedHashSet, 10));
        Iterator<T> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFirst());
        }
        return arrayList.contains(aVar);
    }

    private C20322e(T t, LinkedHashSet<C89378p<AbstractC20318a<?>, Long>> linkedHashSet) {
        this.f48170b = t;
        this.f48171c = linkedHashSet;
    }

    public /* synthetic */ C20322e(Object obj, LinkedHashSet linkedHashSet, byte b) {
        this(obj, linkedHashSet);
    }
}
