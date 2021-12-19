package com.bytedance.jedi.p1445a.p1453f;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20160a;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1448c.C20171g;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20318a;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20319b;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20320c;
import com.bytedance.jedi.p1445a.p1462l.C20324f;
import java.util.Arrays;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88935b;
import p4600h.C89378p;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.f.b */
public interface AbstractC20181b<K, V, REQ, RESP> extends AbstractC20318a<C89378p<? extends K, ? extends V>> {

    /* renamed from: e */
    public static final C20182a f47953e = C20182a.f47954a;

    static {
        Covode.recordClassIndex(23689);
    }

    /* renamed from: a */
    V mo33482a(REQ req, RESP resp);

    /* renamed from: b */
    K mo33483b(REQ req);

    /* renamed from: c */
    AbstractC88979t<RESP> mo33487c(REQ req);

    /* renamed from: com.bytedance.jedi.a.f.b$a */
    public static final class C20182a {

        /* renamed from: a */
        static final /* synthetic */ C20182a f47954a = new C20182a();

        private C20182a() {
        }

        /* renamed from: com.bytedance.jedi.a.f.b$a$a */
        public static final class C20183a<K, V, REQ, RESP> extends AbstractC20160a<K, V> implements AbstractC20320c<C89378p<? extends K, ? extends V>> {

            /* renamed from: a */
            private final /* synthetic */ C20324f f47955a;

            static {
                Covode.recordClassIndex(23691);
            }

            @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20320c
            /* renamed from: a */
            public final void mo33477a(AbstractC20319b<C89378p<K, V>> bVar) {
                C89219l.m154719c(bVar, "");
                this.f47955a.mo33477a(bVar);
            }

            @Override // com.bytedance.jedi.p1445a.p1462l.AbstractC20320c
            /* renamed from: b */
            public final AbstractC88979t<AbstractC20319b<C89378p<K, V>>> mo33478b() {
                return this.f47955a.mo33478b();
            }

            @Override // com.bytedance.jedi.p1445a.p1448c.AbstractC20168e
            /* renamed from: a */
            public final AbstractC88979t<List<C89378p<K, V>>> mo33473a() {
                AbstractC88979t<List<C89378p<K, V>>> a = C88925a.m154171a(C88790v.f201616a);
                C89219l.m154709a((Object) a, "");
                return a;
            }

            /* renamed from: com.bytedance.jedi.a.f.b$a$a$b */
            static final class C20185b<T, R> implements AbstractC88434g<T, R> {

                /* renamed from: a */
                public static final C20185b f47957a = new C20185b();

                static {
                    Covode.recordClassIndex(23693);
                }

                C20185b() {
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    C89378p pVar = (C89378p) obj;
                    C89219l.m154719c(pVar, "");
                    return C20171g.m38149a(pVar.getSecond());
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.bytedance.jedi.a.f.b$a$a$d */
            public static final class C20187d<T, R> implements AbstractC88434g<T, R> {

                /* renamed from: a */
                public static final C20187d f47959a = new C20187d();

                static {
                    Covode.recordClassIndex(23695);
                }

                C20187d() {
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    AbstractC20319b bVar = (AbstractC20319b) obj;
                    C89219l.m154719c(bVar, "");
                    return bVar.mo33655a();
                }
            }

            /* renamed from: com.bytedance.jedi.a.f.b$a$a$e */
            static final class C20188e<T, R> implements AbstractC88434g<T, R> {

                /* renamed from: a */
                final /* synthetic */ AbstractC20181b f47960a;

                /* renamed from: b */
                final /* synthetic */ C20183a f47961b;

                /* renamed from: c */
                final /* synthetic */ Object f47962c;

                static {
                    Covode.recordClassIndex(23696);
                }

                C20188e(AbstractC20181b bVar, C20183a aVar, Object obj) {
                    this.f47960a = bVar;
                    this.f47961b = aVar;
                    this.f47962c = obj;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.jedi.a.f.b */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    return C20171g.m38149a(this.f47960a.mo33482a(this.f47962c, obj));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C20183a(AbstractC20181b<K, V, REQ, RESP> bVar) {
                super(bVar);
                C89219l.m154719c(bVar, "");
                this.f47955a = new C20324f(bVar);
            }

            /* renamed from: com.bytedance.jedi.a.f.b$a$a$a */
            static final class C20184a<T> implements AbstractC88438k<C89378p<? extends K, ? extends V>> {

                /* renamed from: a */
                final /* synthetic */ Object f47956a;

                static {
                    Covode.recordClassIndex(23692);
                }

                C20184a(Object obj) {
                    this.f47956a = obj;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88438k
                /* renamed from: a */
                public final /* synthetic */ boolean mo7718a(Object obj) {
                    C89378p pVar = (C89378p) obj;
                    C89219l.m154719c(pVar, "");
                    return C89219l.m154714a(this.f47956a, pVar.getFirst());
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.bytedance.jedi.a.f.b$a$a$c */
            public static final class C20186c<T> implements AbstractC88438k<AbstractC20319b<C89378p<? extends K, ? extends V>>> {

                /* renamed from: a */
                final /* synthetic */ AbstractC20168e[] f47958a;

                static {
                    Covode.recordClassIndex(23694);
                }

                C20186c(AbstractC20168e[] eVarArr) {
                    this.f47958a = eVarArr;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88438k
                /* renamed from: a */
                public final /* synthetic */ boolean mo7718a(Object obj) {
                    AbstractC20319b bVar = (AbstractC20319b) obj;
                    C89219l.m154719c(bVar, "");
                    for (AbstractC20168e eVar : this.f47958a) {
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
            public final AbstractC88979t<C20169f<V>> mo33474a(K k) {
                if ((k instanceof Object) && k != null) {
                    AbstractC20318a<C89378p<K, V>> c = mo33484c();
                    if (c != null) {
                        AbstractC20181b bVar = (AbstractC20181b) c;
                        AbstractC88979t<R> d = bVar.mo33487c(k).mo143292d(new C20188e(bVar, this, k));
                        if (d != null) {
                            return d;
                        }
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
                AbstractC88979t<C20169f<V>> a = C88925a.m154171a(C88790v.f201616a);
                C89219l.m154709a((Object) a, "");
                return a;
            }

            @Override // com.bytedance.jedi.p1445a.p1448c.AbstractC20168e
            /* renamed from: a */
            public final AbstractC88979t<C20169f<V>> mo33475a(K k, AbstractC20168e<?, ?>... eVarArr) {
                C89219l.m154719c(eVarArr, "");
                AbstractC88979t<List<C89378p<K, V>>> i = mo33476a(false, (AbstractC20168e[]) Arrays.copyOf(eVarArr, eVarArr.length)).mo143294e().mo143189i();
                C89219l.m154709a((Object) i, "");
                AbstractC88979t<C20169f<V>> d = C88935b.m154196a(i).mo143268a(new C20184a(k)).mo143292d(C20185b.f47957a);
                C89219l.m154709a((Object) d, "");
                return d;
            }

            @Override // com.bytedance.jedi.p1445a.p1448c.AbstractC20168e
            /* renamed from: a */
            public final AbstractC88979t<List<C89378p<K, V>>> mo33476a(boolean z, AbstractC20168e<?, ?>... eVarArr) {
                C89219l.m154719c(eVarArr, "");
                AbstractC88979t<R> d = this.f47955a.mo33478b().mo143268a(new C20186c(eVarArr)).mo143292d(C20187d.f47959a);
                C89219l.m154709a((Object) d, "");
                AbstractC88979t<List<C89378p<K, V>>> a = m38134a(d, z).mo143261a(C88392a.m153583a());
                C89219l.m154709a((Object) a, "");
                return a;
            }
        }

        static {
            Covode.recordClassIndex(23690);
        }
    }
}
