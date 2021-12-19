package com.bytedance.jedi.p1445a.p1446a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20160a;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20318a;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20319b;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20320c;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20321d;
import com.bytedance.jedi.p1445a.p1462l.C20324f;
import com.bytedance.jedi.p1445a.p1462l.C20327g;
import java.util.Arrays;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4589j.C88935b;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.a.c */
public interface AbstractC20129c<K, V> extends AbstractC20318a<C89378p<? extends K, ? extends V>> {

    /* renamed from: b */
    public static final C20130a f47899b = C20130a.f47900a;

    static {
        Covode.recordClassIndex(23637);
    }

    /* renamed from: a */
    AbstractC88979t<C20169f<V>> mo33456a(K k);

    /* renamed from: a */
    void mo33457a(K k, V v);

    /* renamed from: b */
    AbstractC88979t<List<C89378p<K, V>>> mo33458b();

    /* renamed from: com.bytedance.jedi.a.a.c$a */
    public static final class C20130a {

        /* renamed from: a */
        static final /* synthetic */ C20130a f47900a = new C20130a();

        private C20130a() {
        }

        /* renamed from: com.bytedance.jedi.a.a.c$a$a */
        public static final class C20131a<K, V> extends AbstractC20160a<K, V> implements AbstractC20320c<C89378p<? extends K, ? extends V>>, AbstractC20321d<C89378p<? extends K, ? extends V>> {

            /* renamed from: a */
            private final /* synthetic */ C20324f f47901a;

            /* renamed from: b */
            private final /* synthetic */ C20327g f47902b;

            static {
                Covode.recordClassIndex(23639);
            }

            @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20320c
            /* renamed from: a */
            public final void mo33477a(AbstractC20319b<C89378p<K, V>> bVar) {
                C89219l.m154719c(bVar, "");
                this.f47901a.mo33477a(bVar);
            }

            @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20320c
            /* renamed from: b */
            public final AbstractC88979t<AbstractC20319b<C89378p<K, V>>> mo33478b() {
                return this.f47901a.mo33478b();
            }

            @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20321d
            /* renamed from: b */
            public final void mo33479b(AbstractC20319b<C89378p<K, V>> bVar) {
                C89219l.m154719c(bVar, "");
                this.f47902b.mo33479b(bVar);
            }

            @Override // com.bytedance.jedi.p1445a.p1448c.AbstractC20168e
            /* renamed from: a */
            public final AbstractC88979t<List<C89378p<K, V>>> mo33473a() {
                return C20136d.m38109a(this).mo33458b();
            }

            /* renamed from: com.bytedance.jedi.a.a.c$a$a$b */
            static final class C20133b<T, R> implements AbstractC88434g<T, R> {

                /* renamed from: a */
                public static final C20133b f47904a = new C20133b();

                static {
                    Covode.recordClassIndex(23641);
                }

                C20133b() {
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    C89378p pVar = (C89378p) obj;
                    C89219l.m154719c(pVar, "");
                    return C20171g.m38149a(pVar.getSecond());
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.bytedance.jedi.a.a.c$a$a$d */
            public static final class C20135d<T, R> implements AbstractC88434g<T, R> {

                /* renamed from: a */
                public static final C20135d f47906a = new C20135d();

                static {
                    Covode.recordClassIndex(23643);
                }

                C20135d() {
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    AbstractC20319b bVar = (AbstractC20319b) obj;
                    C89219l.m154719c(bVar, "");
                    return bVar.mo33655a();
                }
            }

            /* renamed from: com.bytedance.jedi.a.a.c$a$a$a */
            static final class C20132a<T> implements AbstractC88438k<C89378p<? extends K, ? extends V>> {

                /* renamed from: a */
                final /* synthetic */ Object f47903a;

                static {
                    Covode.recordClassIndex(23640);
                }

                C20132a(Object obj) {
                    this.f47903a = obj;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88438k
                /* renamed from: a */
                public final /* synthetic */ boolean mo7718a(Object obj) {
                    C89378p pVar = (C89378p) obj;
                    C89219l.m154719c(pVar, "");
                    return C89219l.m154714a(this.f47903a, pVar.getFirst());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20131a(AbstractC20129c<K, V> cVar) {
                super(cVar);
                C89219l.m154719c(cVar, "");
                this.f47901a = new C20324f(cVar);
                this.f47902b = new C20327g(cVar);
            }

            @Override // com.bytedance.jedi.p1445a.p1448c.AbstractC20168e
            /* renamed from: a */
            public final AbstractC88979t<C20169f<V>> mo33474a(K k) {
                return C20136d.m38109a(this).mo33456a(k);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.bytedance.jedi.a.a.c$a$a$c */
            public static final class C20134c<T> implements AbstractC88438k<AbstractC20319b<C89378p<? extends K, ? extends V>>> {

                /* renamed from: a */
                final /* synthetic */ AbstractC20168e[] f47905a;

                static {
                    Covode.recordClassIndex(23642);
                }

                C20134c(AbstractC20168e[] eVarArr) {
                    this.f47905a = eVarArr;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88438k
                /* renamed from: a */
                public final /* synthetic */ boolean mo7718a(Object obj) {
                    AbstractC20319b bVar = (AbstractC20319b) obj;
                    C89219l.m154719c(bVar, "");
                    for (AbstractC20168e eVar : this.f47905a) {
                        AbstractC20318a<C89378p<K, V>> c = eVar.mo33484c();
                        if (c == null || bVar.mo33656a((AbstractC20318a<?>) c)) {
                            return false;
                        }
                    }
                    return true;
                }
            }

            @Override // com.bytedance.jedi.p1445a.p1448c.AbstractC20168e
            /* renamed from: a */
            public final AbstractC88979t<C20169f<V>> mo33475a(K k, AbstractC20168e<?, ?>... eVarArr) {
                C89219l.m154719c(eVarArr, "");
                AbstractC88979t<List<C89378p<K, V>>> i = mo33476a(false, (AbstractC20168e[]) Arrays.copyOf(eVarArr, eVarArr.length)).mo143294e().mo143189i();
                C89219l.m154709a((Object) i, "");
                AbstractC88979t<C20169f<V>> d = C88935b.m154196a(i).mo143268a(new C20132a(k)).mo143292d(C20133b.f47904a);
                C89219l.m154709a((Object) d, "");
                return d;
            }

            @Override // com.bytedance.jedi.p1445a.p1448c.AbstractC20168e
            /* renamed from: a */
            public final AbstractC88979t<List<C89378p<K, V>>> mo33476a(boolean z, AbstractC20168e<?, ?>... eVarArr) {
                C89219l.m154719c(eVarArr, "");
                AbstractC88979t<R> d = this.f47901a.mo33478b().mo143268a(new C20134c(eVarArr)).mo143292d(C20135d.f47906a);
                C89219l.m154709a((Object) d, "");
                AbstractC88979t<List<C89378p<K, V>>> a = m38134a(d, z).mo143261a(C88392a.m153583a());
                C89219l.m154709a((Object) a, "");
                return a;
            }
        }

        static {
            Covode.recordClassIndex(23638);
        }
    }
}
