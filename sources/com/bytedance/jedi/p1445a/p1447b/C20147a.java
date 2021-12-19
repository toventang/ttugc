package com.bytedance.jedi.p1445a.p1447b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20181b;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.a.b.a */
public final class C20147a<K, V, REQ, RESP, K1, V1> {

    /* renamed from: d */
    public static final C20148a f47918d = new C20148a((byte) 0);

    /* renamed from: a */
    public AbstractC20181b<K, V, REQ, RESP> f47919a;

    /* renamed from: b */
    public AbstractC20168e<K1, V1> f47920b;

    /* renamed from: c */
    public C20149b<K, RESP, K1, V1> f47921c;

    /* renamed from: com.bytedance.jedi.a.b.a$b */
    public static final class C20149b<K, V, K1, V1> {

        /* renamed from: a */
        public AbstractC89172b<? super K, ? extends K1> f47922a = C20150a.f47924a;

        /* renamed from: b */
        public AbstractC89172b<? super V1, ? extends V> f47923b = C20151b.f47925a;

        /* renamed from: com.bytedance.jedi.a.b.a$b$a */
        static final class C20150a extends AbstractC89220m implements AbstractC89172b<K, K1> {

            /* renamed from: a */
            public static final C20150a f47924a = new C20150a();

            static {
                Covode.recordClassIndex(23658);
            }

            C20150a() {
                super(1);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: K */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final K1 invoke(K k) {
                return k;
            }
        }

        /* renamed from: com.bytedance.jedi.a.b.a$b$b */
        static final class C20151b extends AbstractC89220m implements AbstractC89172b<V1, V> {

            /* renamed from: a */
            public static final C20151b f47925a = new C20151b();

            static {
                Covode.recordClassIndex(23659);
            }

            C20151b() {
                super(1);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: V1 */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final V invoke(V1 v1) {
                return v1;
            }
        }

        static {
            Covode.recordClassIndex(23657);
        }
    }

    static {
        Covode.recordClassIndex(23655);
    }

    /* renamed from: com.bytedance.jedi.a.b.a$a */
    public static final class C20148a {
        static {
            Covode.recordClassIndex(23656);
        }

        private C20148a() {
        }

        public /* synthetic */ C20148a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.jedi.a.b.a$c */
    public static final class C20152c extends AbstractC20179a<K, V, REQ, RESP> {

        /* renamed from: a */
        final /* synthetic */ C20147a f47926a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f47927b;

        static {
            Covode.recordClassIndex(23660);
        }

        @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
        /* renamed from: b */
        public final K mo33483b(REQ req) {
            return this.f47926a.f47919a.mo33483b(req);
        }

        /* renamed from: com.bytedance.jedi.a.b.a$c$a */
        static final class C20153a<T> implements AbstractC88438k<C20169f<? extends V1>> {

            /* renamed from: a */
            public static final C20153a f47928a = new C20153a();

            static {
                Covode.recordClassIndex(23661);
            }

            C20153a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88438k
            /* renamed from: a */
            public final /* synthetic */ boolean mo7718a(Object obj) {
                C20169f fVar = (C20169f) obj;
                C89219l.m154719c(fVar, "");
                if (fVar.mo33486a() != null) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.bytedance.jedi.a.b.a$c$b */
        static final class C20154b<T, R> implements AbstractC88434g<T, R> {

            /* renamed from: a */
            final /* synthetic */ C20152c f47929a;

            static {
                Covode.recordClassIndex(23662);
            }

            C20154b(C20152c cVar) {
                this.f47929a = cVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                C20169f fVar = (C20169f) obj;
                C89219l.m154719c(fVar, "");
                AbstractC89172b<? super V1, ? extends V> bVar = this.f47929a.f47926a.f47921c.f47923b;
                Object obj2 = (Object) fVar.mo33486a();
                if (obj2 == 0) {
                    C89219l.m154707a();
                }
                return bVar.invoke(obj2);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.jedi.a.c.e<K1, V1> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
        /* renamed from: a */
        public final AbstractC88979t<RESP> mo33481a(REQ req) {
            AbstractC89183m mVar = this.f47927b;
            AbstractC88979t<RESP> c = this.f47926a.f47919a.mo33487c(req);
            AbstractC88979t d = this.f47926a.f47920b.mo33474a(this.f47926a.f47921c.f47922a.invoke(this.f47926a.f47919a.mo33483b(req))).mo143268a(C20153a.f47928a).mo143292d(new C20154b(this));
            C89219l.m154709a((Object) d, "");
            return (AbstractC88979t) mVar.invoke(c, d);
        }

        C20152c(C20147a aVar, AbstractC89183m mVar) {
            this.f47926a = aVar;
            this.f47927b = mVar;
        }

        @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
        /* renamed from: a */
        public final V mo33482a(REQ req, RESP resp) {
            return this.f47926a.f47919a.mo33482a(req, resp);
        }
    }

    /* renamed from: a */
    public final AbstractC20181b<K, V, REQ, RESP> mo33480a(AbstractC89183m<? super AbstractC88979t<RESP>, ? super AbstractC88979t<RESP>, ? extends AbstractC88979t<RESP>> mVar) {
        C89219l.m154719c(mVar, "");
        return new C20152c(this, mVar);
    }

    private C20147a(AbstractC20181b<K, V, REQ, RESP> bVar, AbstractC20168e<K1, V1> eVar, C20149b<K, RESP, K1, V1> bVar2) {
        this.f47919a = bVar;
        this.f47920b = eVar;
        this.f47921c = bVar2;
    }

    public /* synthetic */ C20147a(AbstractC20181b bVar, AbstractC20168e eVar, C20149b bVar2, byte b) {
        this(bVar, eVar, bVar2);
    }
}
