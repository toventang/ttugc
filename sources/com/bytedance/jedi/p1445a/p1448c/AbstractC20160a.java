package com.bytedance.jedi.p1445a.p1448c;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20318a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4585f.AbstractC88919b;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.c.a */
public abstract class AbstractC20160a<K, V> implements AbstractC20168e<K, V> {

    /* renamed from: a */
    private final WeakReference<AbstractC20318a<C89378p<K, V>>> f47934a;

    static {
        Covode.recordClassIndex(23668);
    }

    @Override // com.bytedance.jedi.p1445a.p1448c.AbstractC20168e
    /* renamed from: c */
    public final AbstractC20318a<C89378p<K, V>> mo33484c() {
        return this.f47934a.get();
    }

    /* renamed from: com.bytedance.jedi.a.c.a$a */
    static final class C20161a<T, R> implements AbstractC88434g<T, K> {

        /* renamed from: a */
        public static final C20161a f47935a = new C20161a();

        static {
            Covode.recordClassIndex(23669);
        }

        C20161a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89378p pVar = (C89378p) obj;
            C89219l.m154719c(pVar, "");
            return pVar.getFirst();
        }
    }

    /* renamed from: com.bytedance.jedi.a.c.a$b */
    static final class C20162b<T, R> implements AbstractC88434g<T, AbstractC88984x<? extends R>> {

        /* renamed from: a */
        public static final C20162b f47936a = new C20162b();

        static {
            Covode.recordClassIndex(23670);
        }

        C20162b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC88979t tVar = (AbstractC88979t) obj;
            C89219l.m154719c(tVar, "");
            return tVar.mo143298f(100, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: com.bytedance.jedi.a.c.a$d */
    static final class C20164d<T, R> implements AbstractC88434g<T, R> {

        /* renamed from: a */
        public static final C20164d f47938a = new C20164d();

        static {
            Covode.recordClassIndex(23672);
        }

        C20164d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154719c(obj, "");
            return C89070n.m154516a(obj);
        }
    }

    public AbstractC20160a(AbstractC20318a<C89378p<K, V>> aVar) {
        C89219l.m154719c(aVar, "");
        this.f47934a = new WeakReference<>(aVar);
    }

    /* renamed from: com.bytedance.jedi.a.c.a$c */
    static final class C20163c<T> implements AbstractC88438k<List<C89378p<? extends K, ? extends V>>> {

        /* renamed from: a */
        public static final C20163c f47937a = new C20163c();

        static {
            Covode.recordClassIndex(23671);
        }

        C20163c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            List list = (List) obj;
            C89219l.m154719c(list, "");
            if (list.size() > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    protected static AbstractC88979t<List<C89378p<K, V>>> m38134a(AbstractC88979t<C89378p<K, V>> tVar, boolean z) {
        C89219l.m154719c(tVar, "");
        if (z) {
            AbstractC88969g j = new C88960c().mo143230j();
            tVar.mo143286c(C20161a.f47935a).mo143267a((AbstractC88434g<? super AbstractC88919b<K, C89378p<K, V>>, ? extends AbstractC88984x<? extends R>>) C20162b.f47936a, false).mo143288c((AbstractC88986z) j);
            AbstractC88979t<List<C89378p<K, V>>> a = j.mo143284c(100, TimeUnit.MILLISECONDS).mo143268a(C20163c.f47937a);
            C89219l.m154709a((Object) a, "");
            return a;
        }
        AbstractC88979t<R> d = tVar.mo143292d(C20164d.f47938a);
        C89219l.m154709a((Object) d, "");
        return d;
    }
}
